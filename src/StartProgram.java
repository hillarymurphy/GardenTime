import View.Gardening;
import Model.*;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
		GardenBox gBox1 = new GardenBox(1, 20, 5, 10, "full");

	    
	    GardenBox gBox2 = new GardenBox(2, 6, 3, 5, "full");
	    GardenBox gBox3 = new GardenBox(3, 6, 3, 6, "full");
	    GardenBox gBox4 = new GardenBox(4, 6, 3, 6, "full");
	    
	    GardenBox gBox5 = new GardenBox(5, 6, 3, 8, "full");
	    GardenBox gBox6 = new GardenBox(6, 6, 3, 5, "full");
	    GardenBox gBox7 = new GardenBox(7, 6, 3, 5, "full");
	    
	    GardenBox gBox8 = new GardenBox(8, 3, 2, 5, "shady");
	    
	    GardenBox gBox9 = new GardenBox(9, 7, 3, 6, "partial");
	    
	    GardenBox gBox10 = new GardenBox(10, 7, 5, 6, "partial");
	    
	    GardenBox gBox11 = new GardenBox(11, 7, 3, 6, "partial");
	    
	    GardenBox gBox12 = new GardenBox(12, 3, 2, 5, "partial");
	    GardenBoxLinkedList llist = new GardenBoxLinkedList();
	    
	    
	    llist.push(gBox1);
	    llist.append(gBox2);
	    llist.append(gBox3);
	    llist.append(gBox4);
	    llist.append(gBox5);
	    llist.append(gBox6);
	    llist.append(gBox7);
	    llist.append(gBox8);
	    llist.append(gBox9);
	    llist.append(gBox10);
	    llist.append(gBox11);
	    llist.append(gBox12);
	    
	    BoxToVegHashMap bvMap = new BoxToVegHashMap();
	    
		Gardening g = new Gardening();
		g.open(llist,bvMap, g);
	}

}
