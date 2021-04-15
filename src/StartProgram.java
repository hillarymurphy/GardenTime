
public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 GardenBoxLinkedList llist = new GardenBoxLinkedList();
	        
	        GardenBox Box1 = new GardenBox(20, 5, 10, "full");

	        
	        GardenBox Box2 = new GardenBox(6, 3, 5, "full");
	        GardenBox Box3 = new GardenBox(6, 3, 6, "full");
	        GardenBox Box4 = new GardenBox(6, 3, 6, "full");
	        
	        GardenBox Box5 = new GardenBox(6, 3, 8, "full");
	        GardenBox Box6 = new GardenBox(6, 3, 5, "full");
	        GardenBox Box7 = new GardenBox(6, 3, 5, "full");
	        
	        GardenBox Box8 = new GardenBox(3, 2, 5, "shady");
	        
	        GardenBox Box9 = new GardenBox(7, 3, 6, "partial sun");
	        
	        GardenBox Box10 = new GardenBox(7, 5, 6, "partial sun");
	        
	        GardenBox Box11 = new GardenBox(7, 3, 6, "partial sun");
	        
	        GardenBox Box12 = new GardenBox(3, 2, 5, "partial sun");
	        llist.push(Box1);
	        llist.append(Box2);
	        llist.append(Box3);
	        llist.append(Box4);
	        llist.append(Box5);
	        llist.append(Box6);
	        llist.append(Box7);
	        llist.append(Box8);
	        llist.append(Box9);
	        llist.append(Box10);
	        llist.append(Box11);
	        llist.append(Box12);
	        
	        Gardening g = new Gardening();
			g.open();
	}

}
