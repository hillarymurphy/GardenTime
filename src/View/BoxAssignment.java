package View;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

import Model.*;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class BoxAssignment {

	protected Shell shlBoxSelection;
	private Text txtBasedOnThe;
	private Text Recommendation;
	private Text txtDoYouWant;
	private Text txtBoxSwitch;
	
	GardenBox selBox = new GardenBox();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BoxAssignment window = new BoxAssignment();
			window.open(null, null, null, null, null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public GardenBox open(String pass, GardenBoxLinkedList nlist, GardenBox box, Gardening g, Vegetable v, String[] bt) {
		Display display = Display.getDefault();
		selBox = createContents(pass, nlist, box, g, v, bt);
		shlBoxSelection.open();
		shlBoxSelection.layout();
		while (!shlBoxSelection.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return selBox;
	}

	/**
	 * Create contents of the window.
	 */
	protected GardenBox createContents(String pass, GardenBoxLinkedList nlist, GardenBox box, Gardening g, Vegetable v, String[] bt) {
		selBox = box;
		shlBoxSelection = new Shell();
		shlBoxSelection.setSize(450, 300);
		shlBoxSelection.setText("Box Selection");
		
		txtBasedOnThe = new Text(shlBoxSelection, SWT.NONE);
		txtBasedOnThe.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		txtBasedOnThe.setText("Based on the information provided, the following box is recommended");
		txtBasedOnThe.setBounds(10, 10, 387, 21);
		
		Recommendation = new Text(shlBoxSelection, SWT.NONE);
		Recommendation.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		Recommendation.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		Recommendation.setText(pass);
		Recommendation.setBounds(129, 49, 144, 27);
		
		txtDoYouWant = new Text(shlBoxSelection, SWT.NONE);
		txtDoYouWant.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		txtDoYouWant.setText("Click confirm to accept. Enter box number and submit to pick your own.");
		txtDoYouWant.setBounds(10, 96, 414, 21);
		
		Button btnConfirm = new Button(shlBoxSelection, SWT.NONE);
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				g.UpdateVegText(selBox.getBoxNum(), v);
				shlBoxSelection.close();
			}
		});
		btnConfirm.setBounds(71, 137, 75, 25);
		btnConfirm.setText("Confirm");
		
		txtBoxSwitch = new Text(shlBoxSelection, SWT.BORDER);
		txtBoxSwitch.setBounds(167, 139, 76, 21);
		
		Button btnSubmit = new Button(shlBoxSelection, SWT.NONE);
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				int newBox = 0;
				if(checkInteger(txtBoxSwitch.getText()))
				{
					newBox = Integer.parseInt(txtBoxSwitch.getText());
				}
				if (nlist.GetBox(newBox)!= null)
				{
					selBox = nlist.GetBox(newBox);
					g.UpdateVegText(selBox.getBoxNum(), v);
					shlBoxSelection.close();
				}
				else
				{
					MessageDialog.openError(shlBoxSelection, "Error", newBox + "is not a number or not an availabe box");
				}
			}
		});
		btnSubmit.setBounds(261, 137, 75, 25);
		btnSubmit.setText("Submit");
		return selBox;
	}
	public boolean checkInteger(String currentInput)
	{
		boolean isInteger = false;
		
		try 
		{
			Integer.parseInt(currentInput);
			isInteger = true;
		}
		catch (NumberFormatException currentException)
		{
			MessageDialog.openError(shlBoxSelection, "Error", currentInput + "is not a number");
		}
		return isInteger;
	}
}
