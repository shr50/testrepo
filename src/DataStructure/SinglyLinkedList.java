package DataStructure;

public class SinglyLinkedList {
	
    //Represent a node of the singly linked list    
    class Node{    
        int data;    
        Node next;    
        
        //constructor with one argument
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    //Represent the head and tail of the singly linked list    
    public Node head = null;    
    public Node tail = null;    
        
    //addNode() will add a new node to the list    
    public void addNode(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
        
    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }   
    
    public void deleteFromTail() {
    	
    	//checks if list is empty or not
    	if(head==null) {
    		System.out.println("Linked list is empty");
    	}
    	
    	//checks if only one element is there or hold current and iterate if not
    	else {
    		
            //Checks whether the list contains only one element  
            if(head != tail ) {  
                Node current = head;  
                //Loop through the list till the second last element such that current.next is pointing to tail  
                while(current.next != tail) {  
                    current = current.next;  
                }  
                //Second last element will become new tail of the list  
                tail = current;  
                tail.next = null;  
            }  
            //If the list contains only one element  
            //Then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            } 
    	}
    	
    	
    		
    	}
    	
    public void addToHead(int data) {
    	Node newNode= new Node(data);
    	
    	if(head==null) {
    		head=newNode;
    		tail=newNode;
    	}
    	else {
    		
    		//storing to temp is requried beacuse reassigning the value to head will be difficult
    		Node tmp=head;
    		newNode.next=tmp;
    		head=newNode;
    		
    	}
    	
    }
    
    public void deleteFromHead() {
    	
    	
    }
        
    public static void main(String[] args) {    
            
        SinglyLinkedList sList = new SinglyLinkedList();    
            
        //Add nodes to the list    
        sList.addNode(11);    
        sList.addNode(20);    
        sList.addNode(32);    
        sList.addNode(44);
        sList.deleteFromTail();
        sList.deleteFromTail();
        sList.addToHead(16);
            
        //Displays the nodes present in the list    
        sList.display();    
    }

}
