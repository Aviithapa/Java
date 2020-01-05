package Assignment;

import java.awt.Window.Type;

public class duplicate {
	Node head; 
	   
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
  
    void removeDuplicates() 
    { 
         duplicate dup=new duplicate();
    	 Node num1 = null, num2 = null, duplicate = null; 
         num1 = head; 
   

         while (num1 != null && num1.next != null) { 
             num2 = num1; 
  
             while (num2.next != null) { 
                 if (num1.data == num2.next.data) { 
                     duplicate = num2.next; 
                     num2.next = num2.next.next; 
                     dup.push(duplicate.data);
                     dup.removeDuplicates();
                     dup.printList();
                      
                 } else  { 
                     num2 = num2.next; 
                 } 
             } 
             num1 = num1.next; 
         } 
    } 
    
    public void push(int new_data) 
    { 
        
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    }
    
    void printList() 
    { 
        Node temp = head; 
        while (temp != null) 
        { 
           System.out.print(temp.data+" "); 
           temp = temp.next; 
        }   
       
    } 
    
   
	 public static void main(String args[]) 
	    { 
	        duplicate llist = new duplicate(); 
	        llist.push(25); 
	        llist.push(27); 
	        llist.push(25); 
	        llist.push(30); 
	        llist.push(1); 
	        llist.push(2);
	        llist.push(30);
	        llist.push(35);
	        llist.removeDuplicates(); 
	        
	          
	    } 
}
