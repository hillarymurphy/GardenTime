/**
 * Garden Box Linked List class to hold all garden boxes
 * @author Hillary Murphy
 * @version 1
 */

package Model;

public class GardenBoxLinkedList
{
    public Node head;  // head of list
  
    /**
     * Class for Node to hold garden box, node
     * @author Hillary Murphy
     *
     */
    public class Node
    {
        GardenBox box;
        public Node next;
        /**
         * Constructor for Node
         * @param b - garden box and default next node to null
         */
        Node(GardenBox b) {box = b; next = null; }
    }
  
    /**
     * Method to insert a new node at the front of the list
     * @param new_box
     */
    public void push(GardenBox new_box)
    {
        Node new_node = new Node(new_box);
        new_node.next = head;
        head = new_node;
    }
  
    /**
     * Method to insert new node after the provided previous node
     * @param prev_node
     * @param new_box
     */
    public void insertAfter(Node prev_node, GardenBox new_box)
    {
        // if node is empty - it will error
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
  
        Node new_node = new Node(new_box);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
     
    /**
     * Method to add a new node at the end of list. 
     * @param new_box
     */
    public void append(GardenBox new_box)
    {
        Node new_node = new Node(new_box);
  
        //if head is null, just add to list and retun
        if (head == null)
        {
            head = new Node(new_box);
            return;
        }
  
        new_node.next = null;
  
        // traverse until end of list
        Node last = head; 
        while (last.next != null)
            last = last.next;
  
        // the node that used to be the last node, now needs to point to the new node
        last.next = new_node;
        return;
    }
    
    /**
     * Method to get the box associated with the box number
     * @param boxNo
     * @return
     */
    public GardenBox GetBox(int boxNo)
    {
        Node current = head;
        //keep traversing until boxNum matches the box number sent into call
        while (current != null)
        {
            if (current.box.boxNum == boxNo)
                return current.box;
            current = current.next;
        }
 
        // only get to this if the box is invalid
        assert (false);
        return null;
    }
    
    /**
     * Method to delete a box from the linked list if already used
     * @param list - list to remove from
     * @param box - box to remove
     * @return updated list
     */
    public GardenBoxLinkedList deleteAtPosition(GardenBoxLinkedList list, GardenBox box)
    {
    	// Store head node
    	Node currNode = list.head, prev = null;
    	
    	//index counter
    	int counter = 0;
    	
    	while (currNode != null)
    	{
    		if (currNode.box == box)
    		{
    			if (counter == 0)
    			{
    				// since currNode is the required box and head of the list, unlink as head
    				list.head = currNode.next; // Changed head
    				break;
    			}
    			else 
    			{
    				// Since currNode is the required box, unlink currNode from linked list
    				prev.next = currNode.next;
    				break;
    			}
    		}
    		else 
    		{
    			// continue on to the next node
    			prev = currNode;
    			currNode = currNode.next;
    			counter++;
    		}	
    	}
    	return list;
    }
  
    /**
     * Method that prints a string of current list
     * @return String of list
     */
    public String printList()
    {
    	String gBoxString = new String();
        Node tnode = head;
        while (tnode != null)
        {
            gBoxString += tnode.box+"\n";
            tnode = tnode.next;
        }
        return gBoxString;
    }
    
    /**
     * Method to sort the linked list by depth
     * @param headref
     */
    public void insertionSortDepth(Node headref) 
    { 
        // Initialize sorted linked list 
        Node sorted = null; 
        Node current = headref; 
        
        // Traverse the given linked list and insert every 
        // node to sorted 
        while (current != null) 
        { 
            // Store next for next iteration 
            Node next = current.next; 
            
            // insert current in sorted linked list 
            Node temp = sortedInsert(current, sorted); 
            sorted = temp;
            // Update current 
            current = next; 
        } 
        
        // Update head_ref to point to sorted linked list 
        head = sorted; 
        return;
    } 
  
    /**
     * Method to insert a node in sorted order - this is called to from the insertionSortDepth method
     * @param newnode - node to add
     * @param sorted - sorted node
     * @return sorted node
     */
    Node sortedInsert(Node newnode, Node sorted) 
    { 
        // Special case for the head end 
        if (sorted == null || sorted.box.depth >= newnode.box.depth) 
        { 
            newnode.next = sorted; 
            sorted = newnode; 
        } 
        else
        { 
            Node current = sorted; 
            
            // Locate the node before the point of insertion 
            while (current.next != null && current.next.box.depth < newnode.box.depth) 
            { 
                current = current.next; 
            } 
            
            newnode.next = current.next; 
            current.next = newnode; 
        } 
        return sorted;
    } 
    
    /**
     * Method to get a box that has depth required for vegetable
     * @param list - passes in sorted list to iterate through
     * @param depthReq - depth required for vegetable
     * @return garden box that satisfies requirement
     */
    public GardenBox getBox(GardenBoxLinkedList list, double depthReq)
    {
    	Node tnode = list.head;
        while (tnode != null)
        {
            if(depthReq <= tnode.box.depth)
            {
            	return tnode.box;
            }
            tnode = tnode.next;
        }
        return null;
    }
    
}
