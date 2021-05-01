/**************************************************************
* Name        : GardenTimeMurphy - BoxToVegHashMapTester
* Author      : Hillary Murphy
* Created     : 4/30/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows XX
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This is a tester for the hash map class
*               Input:  hardcoded gardenboxes, vegetables, hashmap
*               Output: Information on hashmap and if keys exist
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
package Test;

import Model.BoxToVegHashMap;
import Model.GardenBox;
import Model.Vegetable;

public class BoxToVegHashMapTester {

	public static void main(String[] args) {
		
		GardenBox deepBox = new GardenBox(1, 5, 8, 10, "full");
		Vegetable peas = new Vegetable("peas", "seed", 1, 10, 4, "partial", "low", 8);
		
		GardenBox newBox = new GardenBox(2, 5, 8, 10, "full");
		Vegetable beans = new Vegetable("beans", "seed", 1, 10, 4, "partial", "low", 8);
		
		GardenBox shortBox = new GardenBox(3, 5, 8, 2, "full");

		
		BoxToVegHashMap btov = new BoxToVegHashMap();
		
		btov.putIfAbsent(deepBox, peas);
		btov.putIfAbsent(newBox, beans);
		
		
		System.out.println(btov.containsKey(deepBox));
		System.out.println(btov.containsKey(shortBox));
		
		System.out.println(btov.toString());
	}

}
