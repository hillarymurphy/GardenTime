package View;
import Model.*;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;


public class Gardening {

	protected Shell shlSetUpYour;
	private Text textVeg;
	private Text textSorP;
	private Text textSBetween;
	private Text textSBetweenR;
	private Text textDepth;
	private Text textSun;
	private Text textWater;
	private Text textHarvest;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	
	String[] BoxTexts = {"Box1 Empty", "Box2 Empty", "Box3 Empty", "Box4 Empty", "Box5 Empty", "Box6 Empty", 
			"Box7 Empty", "Box8 Empty", "Box9 Empty", "Box10 Empty", "Box11 Empty", "Box12 Empty"};

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Gardening window = new Gardening();
			window.open(null, null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 * @param llist 
	 */
	public void open(GardenBoxLinkedList llist, BoxToVegHashMap bvMap, Gardening g) {
		Display display = Display.getDefault();
		createContents(llist,bvMap, g);
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
	protected void createContents(GardenBoxLinkedList llist, BoxToVegHashMap bvMap, Gardening g) {
		
		shlSetUpYour = new Shell();
		shlSetUpYour.setSize(612, 513);
		shlSetUpYour.setText("Set Up Your Garden!");
		
		Label lblAddAVegetable = new Label(shlSetUpYour, SWT.NONE);
		lblAddAVegetable.setText("Add a Vegetable");
		lblAddAVegetable.setBounds(0, 0, 85, 15);
		
		textVeg = new Text(shlSetUpYour, SWT.BORDER);
		textVeg.setBounds(202, 26, 76, 21);
		
		Label lblVegetable = new Label(shlSetUpYour, SWT.NONE);
		lblVegetable.setText("Vegetable:");
		lblVegetable.setBounds(0, 29, 54, 15);
		
		Label lblSeedOrPlant = new Label(shlSetUpYour, SWT.NONE);
		lblSeedOrPlant.setText("Seed or Plant:");
		lblSeedOrPlant.setBounds(0, 56, 72, 15);
		
		textSorP = new Text(shlSetUpYour, SWT.BORDER);
		textSorP.setBounds(202, 53, 76, 21);
		
		Label lblSpaceBetween = new Label(shlSetUpYour, SWT.NONE);
		lblSpaceBetween.setText("Space between seeds (inches):");
		lblSpaceBetween.setBounds(0, 80, 159, 15);
		
		textSBetween = new Text(shlSetUpYour, SWT.BORDER);
		textSBetween.setBounds(202, 77, 76, 21);
		
		Label lblSpaceBetweenRows = new Label(shlSetUpYour, SWT.NONE);
		lblSpaceBetweenRows.setText("Space between rows (inches):");
		lblSpaceBetweenRows.setBounds(0, 107, 155, 15);
		
		textSBetweenR = new Text(shlSetUpYour, SWT.BORDER);
		textSBetweenR.setBounds(202, 104, 76, 21);
		
		Label lblDepthRequired = new Label(shlSetUpYour, SWT.NONE);
		lblDepthRequired.setText("Depth Required (inches):");
		lblDepthRequired.setBounds(294, 32, 130, 15);
		
		textDepth = new Text(shlSetUpYour, SWT.BORDER);
		textDepth.setBounds(496, 29, 76, 21);
		
		Label lblSunRequiredshady = new Label(shlSetUpYour, SWT.NONE);
		lblSunRequiredshady.setText("Sun Required (shady, partial, full):");
		lblSunRequiredshady.setBounds(294, 56, 177, 15);
		
		textSun = new Text(shlSetUpYour, SWT.BORDER);
		textSun.setBounds(496, 56, 76, 21);
		
		Label lblWaterRequired = new Label(shlSetUpYour, SWT.NONE);
		lblWaterRequired.setText("Water Required:");
		lblWaterRequired.setBounds(294, 83, 84, 15);
		
		textWater = new Text(shlSetUpYour, SWT.BORDER);
		textWater.setBounds(496, 83, 76, 21);
		
		Label lblHarvestDurationin = new Label(shlSetUpYour, SWT.NONE);
		lblHarvestDurationin.setText("Harvest Duration (in weeks):");
		lblHarvestDurationin.setBounds(294, 110, 148, 15);
		
		textHarvest = new Text(shlSetUpYour, SWT.BORDER);
		textHarvest.setBounds(496, 110, 76, 21);
		
		
		
		Label Box1Veg = new Label(shlSetUpYour, SWT.NONE);
		Box1Veg.setText(BoxTexts[0]);
		Box1Veg.setBounds(-1, 184, 117, 15);
		formToolkit.adapt(Box1Veg, true, true);
		
		Label Box1Specs = new Label(shlSetUpYour, SWT.NONE);
		Box1Specs.setText("" + llist.GetBox(1));
		Box1Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box1Specs.setBounds(62, 366, 54, 70);
		formToolkit.adapt(Box1Specs, true, true);
		
		Label Box1 = formToolkit.createLabel(shlSetUpYour, "Box 2", SWT.BORDER);
		Box1.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box1.setBounds(0, 205, 122, 237);
		
		Label Box2Veg = new Label(shlSetUpYour, SWT.NONE);
		Box2Veg.setText(BoxTexts[1]);
		Box2Veg.setBounds(128, 170, 110, 15);
		formToolkit.adapt(Box2Veg, true, true);
		
		Label Box2Specs = new Label(shlSetUpYour, SWT.NONE);
		Box2Specs.setText("" + llist.GetBox(2));
		Box2Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box2Specs.setBounds(179, 191, 54, 70);
		formToolkit.adapt(Box2Specs, true, true);
		
		Label Box2 = formToolkit.createLabel(shlSetUpYour, "Box 2", SWT.BORDER);
		Box2.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box2.setBounds(128, 189, 110, 75);
		
		Label Box3Veg = new Label(shlSetUpYour, SWT.NONE);
		Box3Veg.setText(BoxTexts[2]);
		Box3Veg.setBounds(128, 267, 110, 15);
		formToolkit.adapt(Box3Veg, true, true);
		
		Label Box3Specs = new Label(shlSetUpYour, SWT.NONE);
		Box3Specs.setText("" + llist.GetBox(3));
		Box3Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box3Specs.setBounds(179, 288, 54, 70);
		formToolkit.adapt(Box3Specs, true, true);
		
		Label Box3 = formToolkit.createLabel(shlSetUpYour, "Box 3", SWT.BORDER);
		Box3.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box3.setBounds(128, 286, 110, 75);
		
		Label Box4Veg = new Label(shlSetUpYour, SWT.NONE);
		Box4Veg.setText(BoxTexts[3]);
		Box4Veg.setBounds(128, 370, 110, 15);
		formToolkit.adapt(Box4Veg, true, true);
		
		Label Box4Specs = new Label(shlSetUpYour, SWT.NONE);
		Box4Specs.setText("" + llist.GetBox(4));
		Box4Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box4Specs.setBounds(179, 391, 54, 70);
		formToolkit.adapt(Box4Specs, true, true);
		
		Label Box4 = formToolkit.createLabel(shlSetUpYour, "Box 4", SWT.BORDER);
		Box4.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box4.setBounds(128, 389, 110, 75);
		
		Label Box5Veg = new Label(shlSetUpYour, SWT.NONE);
		Box5Veg.setText(BoxTexts[4]);
		Box5Veg.setBounds(244, 170, 110, 15);
		formToolkit.adapt(Box5Veg, true, true);
		
		Label Box5Specs = new Label(shlSetUpYour, SWT.NONE);
		Box5Specs.setText("" + llist.GetBox(5));
		Box5Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box5Specs.setBounds(294, 191, 54, 70);
		formToolkit.adapt(Box5Specs, true, true);
		
		Label Box5 = formToolkit.createLabel(shlSetUpYour, "Box 5", SWT.BORDER);
		Box5.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box5.setBounds(244, 189, 110, 75);
		
		Label Box6Veg = new Label(shlSetUpYour, SWT.NONE);
		Box6Veg.setText(BoxTexts[5]);
		Box6Veg.setBounds(244, 267, 110, 15);
		formToolkit.adapt(Box6Veg, true, true);
		
		Label Box6Specs = new Label(shlSetUpYour, SWT.NONE);
		Box6Specs.setText("" + llist.GetBox(6));
		Box6Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box6Specs.setBounds(294, 288, 54, 70);
		formToolkit.adapt(Box6Specs, true, true);
		
		Label Box6 = formToolkit.createLabel(shlSetUpYour, "Box 6", SWT.BORDER);
		Box6.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box6.setBounds(244, 286, 110, 75);
		
		Label Box7Veg = new Label(shlSetUpYour, SWT.NONE);
		Box7Veg.setText(BoxTexts[6]);
		Box7Veg.setBounds(244, 370, 110, 15);
		formToolkit.adapt(Box7Veg, true, true);
		
		Label Box7Specs = new Label(shlSetUpYour, SWT.NONE);
		Box7Specs.setText("" + llist.GetBox(7));
		Box7Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box7Specs.setBounds(294, 391, 54, 70);
		formToolkit.adapt(Box7Specs, true, true);
		
		Label Box7 = formToolkit.createLabel(shlSetUpYour, "Box 7", SWT.BORDER);
		Box7.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box7.setBounds(244, 389, 110, 75);
		
		Label Box8Veg = new Label(shlSetUpYour, SWT.NONE);
		Box8Veg.setText(BoxTexts[7]);
		Box8Veg.setBounds(361, 170, 110, 15);
		formToolkit.adapt(Box8Veg, true, true);
		
		Label Box8Specs = new Label(shlSetUpYour, SWT.NONE);
		Box8Specs.setText("" + llist.GetBox(8));
		Box8Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box8Specs.setBounds(426, 191, 54, 70);
		formToolkit.adapt(Box8Specs, true, true);
		
		Label Box8 = formToolkit.createLabel(shlSetUpYour, "Box 8", SWT.BORDER);
		Box8.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box8.setBounds(360, 189, 125, 55);
		
		Label Box9Veg = new Label(shlSetUpYour, SWT.NONE);
		Box9Veg.setText(BoxTexts[8]);
		Box9Veg.setBounds(361, 267, 110, 15);
		formToolkit.adapt(Box9Veg, true, true);
		
		Label Box9Specs = new Label(shlSetUpYour, SWT.NONE);
		Box9Specs.setText("" + llist.GetBox(9));
		Box9Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box9Specs.setBounds(426, 289, 54, 70);
		formToolkit.adapt(Box9Specs, true, true);
		
		Label Box9 = formToolkit.createLabel(shlSetUpYour, "Box 9", SWT.BORDER);
		Box9.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box9.setBounds(360, 285, 125, 80);
		
		Label Box10Veg = new Label(shlSetUpYour, SWT.NONE);
		Box10Veg.setText(BoxTexts[9]);
		Box10Veg.setBounds(361, 370, 110, 15);
		formToolkit.adapt(Box10Veg, true, true);
		
		Label Box10Specs = new Label(shlSetUpYour, SWT.NONE);
		Box10Specs.setText("" + llist.GetBox(10));
		Box10Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box10Specs.setBounds(426, 391, 54, 70);
		formToolkit.adapt(Box10Specs, true, true);
		
		Label Box10 = formToolkit.createLabel(shlSetUpYour, "Box 10", SWT.BORDER);
		Box10.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box10.setBounds(360, 389, 125, 55);
		
		Label Box11Veg = new Label(shlSetUpYour, SWT.NONE);
		Box11Veg.setText(BoxTexts[10]);
		Box11Veg.setBounds(507, 207, 85, 15);
		formToolkit.adapt(Box11Veg, true, true);
		
		Label Box11Specs = new Label(shlSetUpYour, SWT.NONE);
		Box11Specs.setText("" + llist.GetBox(11));
		Box11Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box11Specs.setBounds(532, 241, 54, 70);
		formToolkit.adapt(Box11Specs, true, true);
		
		Label Box11 = formToolkit.createLabel(shlSetUpYour, "Box 11", SWT.BORDER);
		Box11.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box11.setBounds(517, 227, 75, 45);
		
		Label Box12Veg = new Label(shlSetUpYour, SWT.NONE);
		Box12Veg.setText(BoxTexts[11]);
		Box12Veg.setBounds(507, 318, 85, 15);
		formToolkit.adapt(Box12Veg, true, true);
		
		Label Box12Specs = new Label(shlSetUpYour, SWT.NONE);
		Box12Specs.setText("" + llist.GetBox(12));
		Box12Specs.setFont(SWTResourceManager.getFont("Arial", 8, SWT.NORMAL));
		Box12Specs.setBounds(532, 352, 54, 70);
		formToolkit.adapt(Box12Specs, true, true);
		
		Label Box12 = formToolkit.createLabel(shlSetUpYour, "Box 12", SWT.BORDER);
		Box12.setBackground(SWTResourceManager.getColor(204, 255, 204));
		Box12.setBounds(517, 337, 75, 45);
		
		Button btnSubmit = new Button(shlSetUpYour, SWT.NONE);
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
				String kind = textVeg.getText();
				String seedOrPlant = textSorP.getText();
				Double spacePer = 0.0;
				if(checkDouble(textSBetween.getText()))
				{
					spacePer = Double.parseDouble(textSBetween.getText());
				}
				double spaceRow = 0.0;
				if(checkDouble(textSBetweenR.getText()))
				{
					spaceRow = Double.parseDouble(textSBetweenR.getText());
				}
				double depthReq = 0.0;
				if(checkDouble(textDepth.getText()))
				{
					depthReq = Double.parseDouble(textDepth.getText());
				}
				String sunReq = textSun.getText();
				String waterReq = textWater.getText();
				int harvestDuration = 0;
				if(checkInteger(textHarvest.getText()))
				{
					harvestDuration = Integer.parseInt(textHarvest.getText());
				}
				
				Vegetable tempVeg = new Vegetable(kind, seedOrPlant, spacePer, spaceRow, depthReq, sunReq, waterReq, harvestDuration);
				
				GardenBoxLinkedList nlist = new GardenBoxLinkedList();
				nlist = llist;

		        nlist.insertionSortDepth(nlist.head); 
		        
		        GardenBox sugBox = nlist.getBox(nlist, depthReq);
				
				BoxAssignment boxA = new BoxAssignment();
				String pass = sugBox.BoxNumtoString();
				sugBox = boxA.open(pass, nlist, sugBox, g, tempVeg, BoxTexts);
				Box1Veg.setText(BoxTexts[0]);
				Box2Veg.setText(BoxTexts[1]);
				Box3Veg.setText(BoxTexts[2]);
				Box4Veg.setText(BoxTexts[3]);
				Box5Veg.setText(BoxTexts[4]);
				Box6Veg.setText(BoxTexts[5]);
				Box7Veg.setText(BoxTexts[6]);
				Box8Veg.setText(BoxTexts[7]);
				Box9Veg.setText(BoxTexts[8]);
				Box10Veg.setText(BoxTexts[9]);
				Box11Veg.setText(BoxTexts[10]);
				Box12Veg.setText(BoxTexts[11]);
				bvMap.putIfAbsent(sugBox, tempVeg);
				nlist.deleteAtPosition(nlist, sugBox);
				
				textVeg.setText("");
				textSorP.setText("");
				textSBetween.setText("");
				textSBetweenR.setText("");
				textDepth.setText("");
				textSun.setText("");
				textWater.setText("");
				textHarvest.setText("");
			}
		});
		
		btnSubmit.setBounds(246, 138, 75, 25);
		formToolkit.adapt(btnSubmit, true, true);
		btnSubmit.setText("Submit");

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
			MessageDialog.openError(shlSetUpYour, "Error", currentInput + "is not a number");
		}
		return isInteger;
	}
	
	public boolean checkDouble(String currentInput)
	{
		boolean isDouble = false;
		
		try 
		{
			Double.parseDouble(currentInput);
			isDouble = true;
		}
		catch (NumberFormatException currentException)
		{
			MessageDialog.openError(shlSetUpYour, "Error", currentInput + "is not a number");
		}
		return isDouble;
	}
	
	public void UpdateVegText(int boxNo, Vegetable v)
	{
		for(int i=0; i < BoxTexts.length;i++)
		{	
			int tLength = BoxTexts[i].length();
			if (tLength >= 5)
			{
				tLength = 5;
			}
			String temp = (String) BoxTexts[i].subSequence(0, tLength);
			if(temp.contains("Box"+boxNo))
			{
				BoxTexts[i] = v.getKind();
			}
		}
	}
	
}
