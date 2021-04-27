package Test;

import Model.*;

public class GardenBoxLinkedListTester {

	public static void main(String[] args) {
		/* Start with the empty list */
        GardenBoxLinkedList llist = new GardenBoxLinkedList();
        
        GardenBox Box1 = new GardenBox(1, 20, 5, 10, "full");

        
        GardenBox Box2 = new GardenBox(2, 6, 3, 5, "full");
        GardenBox Box3 = new GardenBox(3, 6, 3, 6, "full");
        GardenBox Box4 = new GardenBox(4, 6, 3, 6, "full");
        
        GardenBox Box5 = new GardenBox(5, 6, 3, 8, "full");
        GardenBox Box6 = new GardenBox(6, 6, 3, 5, "full");
        GardenBox Box7 = new GardenBox(7, 6, 3, 5, "full");
        
        GardenBox Box8 = new GardenBox(8, 3, 2, 5, "shady");
        
        GardenBox Box9 = new GardenBox(9, 7, 3, 6, "partial sun");
        
        GardenBox Box10 = new GardenBox(10, 7, 5, 6, "partial sun");
        
        GardenBox Box11 = new GardenBox(11, 7, 3, 6, "partial sun");
        
        GardenBox Box12 = new GardenBox(12, 3, 2, 5, "partial sun");
  
        // Insert Box3.  So linked list becomes Box3->NUllist
        llist.append(Box3);
  
        // Insert Box2 at the beginning. So linked list becomes
        // Box2->Box3->NUllist
        llist.push(Box2);
  
        // Insert Box1 at the beginning. So linked list becomes
        // Box1->Box2->Box3->NUllist
        llist.push(Box1);
  
        // Insert Box5 at the end. So linked list becomes
        // Box1->Box2->Box3->Box5->NUllist
        llist.append(Box5);
  
        // Insert Box4, after Box3. So linked list becomes
        // Box1->Box2->Box3->Box4->Box5->NUllist
        llist.insertAfter(llist.head.next, Box4);
        
        //Add the remainder of the boxes at the end
        llist.append(Box6);
        llist.append(Box7);
        llist.append(Box8);
        llist.append(Box9);
        llist.append(Box10);
        llist.append(Box11);
        llist.append(Box12);
  
        System.out.println("GardenBox Linked List: \n");
        System.out.println(llist.printList());
        
        System.out.println(llist.GetBox(6));
        
        GardenBoxLinkedList nlist = new GardenBoxLinkedList();
        nlist = llist;

        nlist.insertionSortDepth(nlist.head); 
        System.out.println("GardenBox Linked Sorted List: \n");
        System.out.println(nlist.printList());

	}

}
