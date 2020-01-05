package Assignment;
import java.util.Scanner;


public class Search {
	
	  static int Lin(int arr[], int index, int length, int num) 
	     { 
	          if (length < index) 
	             return -1; 
	          if (arr[index] == num) 
	             return index; 
	          if (arr[length] == num) 
	             return length; 
	          return Lin(arr, index+1, length-1, num); 
	     } 
	       
	   
	     public static void main(String[] args)  
	     { 
	    	 int arr[] = {40, 60, 80, 200, 30};
	    
	    	 System.out.println("Enter the number?");
	    	 Scanner number=new Scanner(System.in);
	    	 int num=number.nextInt();
	          
	        int index = Lin(arr, 0, arr.length-1, num); 
	        if (index != -1) 
	           System.out.println( "  present  " ); 
	        else
	            System.out.println( " is not present"); 
	        } 

	}


