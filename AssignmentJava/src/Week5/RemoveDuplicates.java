package Week5;

import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {
	 Node head; 
	   
	    class Node 
	    { 
	        int data; 
	        Node next; 
	        Node(int d) {data = d; next = null; } 
	    } 
	  
	    void removeDuplicates() 
	    { 
	        
	    	 Node num1 = null, num2 = null, duplicate = null; 
	         num1 = head; 
	   
	
	         while (num1 != null && num1.next != null) { 
	             num2 = num1; 
	  
	             while (num2.next != null) { 
	                 if (num1.data == num2.next.data) { 
	                     duplicate = num2.next; 
	                     num2.next = num2.next.next; 
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
	         System.out.println(); 
	     } 
	   
	    public static void main(String args[]) 
	    { 
	        RemoveDuplicates llist = new RemoveDuplicates(); 
	        llist.push(50); 
	        llist.push(50); 
	        llist.push(60); 
	        llist.push(70); 
	        llist.push(60); 
	        llist.push(50);
	        llist.push(80);
	        llist.push(80);
	        llist.removeDuplicates(); 
	          
	        System.out.println("List after removal of duplicate elements"); 
	        llist.printList(); 
	    } 
}
