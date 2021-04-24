package Model;

public class GardenBoxLinkedList
{
    public Node head;  // head of list
  
    /* Linked list Node*/
    public class Node
    {
        public GardenBox box;
        public Node next;
        public Node(GardenBox b) {box = b; next = null; }
    }
  
    /* Inserts a new Node at front of the list. */
    public void push(GardenBox new_box)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_box);
  
        /* 3. Make next of new Node as head */
        new_node.next = head;
  
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
  
    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prev_node, GardenBox new_box)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
  
        /* 2 & 3: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_box);
  
        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;
  
        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }
     
    /* Appends a new node at the end.  This method is 
       defined inside GardenBoxGardenBoxLinkedList class shown above */
    public void append(GardenBox new_box)
    {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        Node new_node = new Node(new_box);
  
        /* 4. If the Linked List is empty, then make the
              new node as head */
        if (head == null)
        {
            head = new Node(new_box);
            return;
        }
  
        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;
  
        /* 5. Else traverse till the last node */
        Node last = head; 
        while (last.next != null)
            last = last.next;
  
        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
    
    public GardenBox GetNth(int index)
    {
        Node current = head;
        int count = 0; /* index of Node we are
                          currently looking at */
        while (current != null)
        {
            if (count == index)
                return current.box;
            count++;
            current = current.next;
        }
 
        /* if we get to this line, the caller was asking
        for a non-existent element so we assert fail */
        assert (false);
        return null;
    }
    
    public GardenBoxLinkedList deleteAtPosition(GardenBoxLinkedList list, int index)
    {
    	// Store head node
    	Node currNode = list.head, prev = null;

    	//index at 0 - remove first box in List
    	if (index == 0 && currNode != null) {
    		list.head = currNode.next; // Changed head

    		// Display the message
    		System.out.println(
    				index + " position element deleted");

    		// Return the updated List
    		return list;
    	}
    	//index greater than 0
    	int counter = 0;

    	// Count for the index to be deleted, note previous node as it is needed to change currNode.next
    	while (currNode != null) {

    		if (counter == index) {
    			// Since the currNode is the required
    			// position Unlink currNode from linked list
    			prev.next = currNode.next;

    			// Display the message
    			System.out.println(
    					index + " position element deleted");
    			break;
    		}
    		else {
    			// If current position is not the index
    			// continue to next node
    			prev = currNode;
    			currNode = currNode.next;
    			counter++;
    		}
    	}

    	// return the List
    	return list;
    }
  
    /* This function prints contents of linked list starting from
        the given node */
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
    
 // function to sort a singly linked list using insertion sort 
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
  
      
    // function to insert a new_node in a list. Note that 
    // this function expects a pointer to head_ref as this 
    // can modify the head of the input linked list 
    // (similar to push()) 
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
