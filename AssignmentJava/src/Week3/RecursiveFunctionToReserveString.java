package Week3;

import java.util.Scanner;

public class RecursiveFunctionToReserveString {

	    
	    void reverse(String str) 
	    { 
	        if ((str==null)||(str.length() <= 1)) 
	           System.out.println(str); 
	        else
	        { 
	            System.out.print(str.charAt(str.length()-1)); 
	            reverse(str.substring(0,str.length()-1)); 
	        } 
	    } 
	      
	  
	    public static void main(String[] args)  
	    { 
	        String str; 
	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter a Word");
	        str=input.next();
	        RecursiveFunctionToReserveString Rev = new RecursiveFunctionToReserveString(); 
	        Rev.reverse(str); 
	        input.close();
	    }  
	
}
