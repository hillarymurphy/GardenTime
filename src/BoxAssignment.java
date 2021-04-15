

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class BoxAssignment {

	protected Shell shlBoxSelection;
	private Text txtBasedOnThe;
	private Text Recommendation;
	private Text txtDoYouWant;
	private Text txtBoxSwitch;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BoxAssignment window = new BoxAssignment();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlBoxSelection.open();
		shlBoxSelection.layout();
		while (!shlBoxSelection.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
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
		Recommendation.setBounds(166, 47, 97, 27);
		
		txtDoYouWant = new Text(shlBoxSelection, SWT.NONE);
		txtDoYouWant.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		txtDoYouWant.setText("Click confirm to accept. Enter box number and submit to pick your own.");
		txtDoYouWant.setBounds(10, 96, 414, 21);
		
		Button btnConfirm = new Button(shlBoxSelection, SWT.NONE);
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
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
			}
		});
		btnSubmit.setBounds(261, 137, 75, 25);
		btnSubmit.setText("Submit");

	}
}
