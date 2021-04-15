import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Gardening {

	protected Shell shlSetUpYour;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Gardening window = new Gardening();
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
		shlSetUpYour.open();
		shlSetUpYour.layout();
		while (!shlSetUpYour.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSetUpYour = new Shell();
		shlSetUpYour.setSize(612, 513);
		shlSetUpYour.setText("Set Up Your Garden!");
		
		Label lblAddAVegetable = new Label(shlSetUpYour, SWT.NONE);
		lblAddAVegetable.setText("Add a Vegetable");
		lblAddAVegetable.setBounds(0, 0, 85, 15);
		
		text = new Text(shlSetUpYour, SWT.BORDER);
		text.setBounds(202, 26, 76, 21);
		
		Label lblVegetable = new Label(shlSetUpYour, SWT.NONE);
		lblVegetable.setText("Vegetable:");
		lblVegetable.setBounds(0, 29, 54, 15);
		
		Label lblSeedOrPlant = new Label(shlSetUpYour, SWT.NONE);
		lblSeedOrPlant.setText("Seed or Plant:");
		lblSeedOrPlant.setBounds(0, 56, 72, 15);
		
		text_1 = new Text(shlSetUpYour, SWT.BORDER);
		text_1.setBounds(202, 53, 76, 21);
		
		Label lblSpaceBetween = new Label(shlSetUpYour, SWT.NONE);
		lblSpaceBetween.setText("Space between seeds (inches):");
		lblSpaceBetween.setBounds(0, 80, 159, 15);
		
		text_2 = new Text(shlSetUpYour, SWT.BORDER);
		text_2.setBounds(202, 77, 76, 21);
		
		Label lblSpaceBetweenRows = new Label(shlSetUpYour, SWT.NONE);
		lblSpaceBetweenRows.setText("Space between rows (inches):");
		lblSpaceBetweenRows.setBounds(0, 107, 155, 15);
		
		text_3 = new Text(shlSetUpYour, SWT.BORDER);
		text_3.setBounds(202, 104, 76, 21);
		
		Label lblDepthRequired = new Label(shlSetUpYour, SWT.NONE);
		lblDepthRequired.setText("Depth Required (inches):");
		lblDepthRequired.setBounds(294, 32, 130, 15);
		
		text_4 = new Text(shlSetUpYour, SWT.BORDER);
		text_4.setBounds(496, 29, 76, 21);
		
		Label lblSunRequiredshady = new Label(shlSetUpYour, SWT.NONE);
		lblSunRequiredshady.setText("Sun Required (shady, partial, full):");
		lblSunRequiredshady.setBounds(294, 56, 177, 15);
		
		text_5 = new Text(shlSetUpYour, SWT.BORDER);
		text_5.setBounds(496, 56, 76, 21);
		
		Label lblWaterRequired = new Label(shlSetUpYour, SWT.NONE);
		lblWaterRequired.setText("Water Required:");
		lblWaterRequired.setBounds(294, 83, 84, 15);
		
		text_6 = new Text(shlSetUpYour, SWT.BORDER);
		text_6.setBounds(496, 83, 76, 21);
		
		Label lblHarvestDurationin = new Label(shlSetUpYour, SWT.NONE);
		lblHarvestDurationin.setText("Harvest Duration (in weeks):");
		lblHarvestDurationin.setBounds(294, 110, 148, 15);
		
		text_7 = new Text(shlSetUpYour, SWT.BORDER);
		text_7.setBounds(496, 110, 76, 21);
		
		Button btnSubmit = new Button(shlSetUpYour, SWT.NONE);
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				BoxAssignment boxA = new BoxAssignment();
				boxA.open();
			}
		});
		btnSubmit.setBounds(246, 138, 75, 25);
		formToolkit.adapt(btnSubmit, true, true);
		btnSubmit.setText("Submit");
		
		Label Box1Specs = new Label(shlSetUpYour, SWT.NONE);
		Box1Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box1Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box1Specs.setBounds(62, 366, 54, 70);
		formToolkit.adapt(Box1Specs, true, true);
		
		Label Box1 = formToolkit.createLabel(shlSetUpYour, "Box 2", SWT.BORDER);
		Box1.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box1.setBounds(0, 205, 122, 237);
		
		Label Box2Specs = new Label(shlSetUpYour, SWT.NONE);
		Box2Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box2Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box2Specs.setBounds(179, 191, 54, 70);
		formToolkit.adapt(Box2Specs, true, true);
		
		Label Box2 = formToolkit.createLabel(shlSetUpYour, "Box 2", SWT.BORDER);
		Box2.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box2.setBounds(128, 189, 110, 75);
		
		Label Box3Specs = new Label(shlSetUpYour, SWT.NONE);
		Box3Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box3Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box3Specs.setBounds(179, 288, 54, 70);
		formToolkit.adapt(Box3Specs, true, true);
		
		Label Box3 = formToolkit.createLabel(shlSetUpYour, "Box 3", SWT.BORDER);
		Box3.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box3.setBounds(128, 286, 110, 75);
		
		Label Box4Specs = new Label(shlSetUpYour, SWT.NONE);
		Box4Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box4Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box4Specs.setBounds(179, 391, 54, 70);
		formToolkit.adapt(Box4Specs, true, true);
		
		Label Box4 = formToolkit.createLabel(shlSetUpYour, "Box 4", SWT.BORDER);
		Box4.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box4.setBounds(128, 389, 110, 75);
		
		Label Box5Specs = new Label(shlSetUpYour, SWT.NONE);
		Box5Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box5Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box5Specs.setBounds(294, 191, 54, 70);
		formToolkit.adapt(Box5Specs, true, true);
		
		Label Box5 = formToolkit.createLabel(shlSetUpYour, "Box 5", SWT.BORDER);
		Box5.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box5.setBounds(244, 189, 110, 75);
		
		Label Box6Specs = new Label(shlSetUpYour, SWT.NONE);
		Box6Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box6Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box6Specs.setBounds(294, 288, 54, 70);
		formToolkit.adapt(Box6Specs, true, true);
		
		Label Box6 = formToolkit.createLabel(shlSetUpYour, "Box 6", SWT.BORDER);
		Box6.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box6.setBounds(244, 286, 110, 75);
		
		Label Box7Specs = new Label(shlSetUpYour, SWT.NONE);
		Box7Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box7Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box7Specs.setBounds(294, 391, 54, 70);
		formToolkit.adapt(Box7Specs, true, true);
		
		Label Box7 = formToolkit.createLabel(shlSetUpYour, "Box 7", SWT.BORDER);
		Box7.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box7.setBounds(244, 389, 110, 75);
		
		Label Box8Specs = new Label(shlSetUpYour, SWT.NONE);
		Box8Specs.setText("W:\r\nL:");
		Box8Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box8Specs.setBounds(363, 207, 54, 35);
		formToolkit.adapt(Box8Specs, true, true);
		
		Label Box8Spec2 = new Label(shlSetUpYour, SWT.NONE);
		Box8Spec2.setText("A:\r\nD:\r\nS:");
		Box8Spec2.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box8Spec2.setBounds(420, 197, 54, 45);
		formToolkit.adapt(Box8Spec2, true, true);
		
		Label Box8 = formToolkit.createLabel(shlSetUpYour, "Box 8", SWT.BORDER);
		Box8.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box8.setBounds(360, 189, 125, 55);
		
		Label Box9Specs = new Label(shlSetUpYour, SWT.NONE);
		Box9Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box9Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box9Specs.setBounds(426, 275, 54, 70);
		formToolkit.adapt(Box9Specs, true, true);
		
		Label Box9 = formToolkit.createLabel(shlSetUpYour, "Box 9", SWT.BORDER);
		Box9.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box9.setBounds(360, 269, 125, 80);
		
		Label Box10Specs = new Label(shlSetUpYour, SWT.NONE);
		Box10Specs.setText("W:\r\nL:");
		Box10Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box10Specs.setBounds(363, 393, 54, 35);
		formToolkit.adapt(Box10Specs, true, true);
		
		Label Box10Spec2 = new Label(shlSetUpYour, SWT.NONE);
		Box10Spec2.setText("A:\r\nD:\r\nS:");
		Box10Spec2.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box10Spec2.setBounds(420, 383, 54, 45);
		formToolkit.adapt(Box10Spec2, true, true);
		
		Label Box10 = formToolkit.createLabel(shlSetUpYour, "Box 10", SWT.BORDER);
		Box10.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box10.setBounds(360, 375, 125, 55);
		
		Label Box11Specs = new Label(shlSetUpYour, SWT.NONE);
		Box11Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box11Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box11Specs.setBounds(532, 241, 54, 70);
		formToolkit.adapt(Box11Specs, true, true);
		
		Label Box11 = formToolkit.createLabel(shlSetUpYour, "Box 11", SWT.BORDER);
		Box11.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box11.setBounds(517, 227, 75, 45);
		
		Label Box12Specs = new Label(shlSetUpYour, SWT.NONE);
		Box12Specs.setText("W:\r\nL:\r\nA:\r\nD:\r\nS:");
		Box12Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box12Specs.setBounds(532, 341, 54, 70);
		formToolkit.adapt(Box12Specs, true, true);
		
		Label Box12 = formToolkit.createLabel(shlSetUpYour, "Box 12", SWT.BORDER);
		Box12.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box12.setBounds(517, 326, 75, 45);

	}
}
