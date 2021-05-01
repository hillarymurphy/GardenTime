/**************************************************************
* Name        : GardenTimeMurphy - Vegetable Tester
* Author      : Hillary Murphy
* Created     : 4/29/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows XX
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This is a tester for the Vegetable class
*               Input: Empty vegetable, create peas vegetable, update peas vegetable
*               Output: print information on each vegetable
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
* ***************************************************************/
package Test;

import Model.Vegetable;

public class VegetableTester {

	public static void main(String[] args) {

		Vegetable randomVeg = new Vegetable();
		System.out.println(randomVeg.toString());
		
		Vegetable peas = new Vegetable("peas", "seed", 1, 10, 4, "partial", "low", 8);
		System.out.println(peas.getKind());
		System.out.println(peas.getSeedOrPlant());
		System.out.println(peas.getSpacePer());
		System.out.println(peas.getSpaceRow());
		System.out.println(peas.getDepthReq());
		System.out.println(peas.getSunReq());
		System.out.println(peas.getWaterReq());
		System.out.println(peas.getHarvestDuration());
		
		peas.setKind("Sugar Peas");
		peas.setSeedOrPlant("Seed");
		peas.setSpacePer(1.5);
		peas.setSpaceRow(6.5);
		peas.setDepthReq(3);
		peas.setSunReq("full");
		peas.setWaterReq("moderate");
		peas.setHarvestDuration(6);
		
		System.out.println(peas.getKind());
		System.out.println(peas.getSeedOrPlant());
		System.out.println(peas.getSpacePer());
		System.out.println(peas.getSpaceRow());
		System.out.println(peas.getDepthReq());
		System.out.println(peas.getSunReq());
		System.out.println(peas.getWaterReq());
		System.out.println(peas.getHarvestDuration());
	}

}
