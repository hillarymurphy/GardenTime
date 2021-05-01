/**************************************************************
* Name        : GardenTimeMurphy - GardenBox Tester
* Author      : Hillary Murphy
* Created     : 4/29/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows XX
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This is a tester for the Garden Box class
*               Input: Empty garden box, create deep box, update deep box
*               Output: print information on each box
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
* ***************************************************************/

package Test;

import Model.GardenBox;

public class GardenBoxTester {

	public static void main(String[] args) {
		
		GardenBox newBox = new GardenBox();
		System.out.println(newBox.toString());
		
		GardenBox deepBox = new GardenBox(1, 5, 8, 10, "full");
		System.out.println(deepBox.getBoxNum());
		System.out.println(deepBox.getLength());
		System.out.println(deepBox.getWidth());
		System.out.println(deepBox.getArea());
		System.out.println(deepBox.getDepth());
		System.out.println(deepBox.getSun());
		
		deepBox.setBoxNum(77);
		deepBox.setLength(4);
		deepBox.setWidth(5);
		deepBox.setArea();
		deepBox.setDepth(12);
		deepBox.setSun("partial");
		
		System.out.println(deepBox.getBoxNum());
		System.out.println(deepBox.getLength());
		System.out.println(deepBox.getWidth());
		System.out.println(deepBox.getArea());
		System.out.println(deepBox.getDepth());
		System.out.println(deepBox.getSun());
		
		System.out.println(deepBox.BoxNumtoString());
		
	}

}
