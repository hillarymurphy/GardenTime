class GardenBoxLinkedList
{
    Node head;  // head of list
  
    /* Linked list Node*/
    class Node
    {
        GardenBox box;
        Node next;
        Node(GardenBox b) {box = b; next = null; }
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
}
