/*
 * DECLARE three number
 * INPUT three number
 * IF num1 > num2 AND num1 < num2
 * 		IF num2<num1
 * 			DISPLAY num1,num2,num3
 *      ELSE
 *          DISPLAY num1,num3,num2
 * ELSE IF num2<num1 AND num2<num3
 * 		IF num1<num3
 * 			DISPLAY num2,num1,num3
 * 		ELSE 
 *          DISPLAY num2,num3,num1
 * ELSE IF  num3<num1 AND num3<num1
 * 		IF num1<num2
 * 			DISPLAY num3,num1,num2
 * 		ELSE 
 *  		DISPLAY num3,num2,num1		
 */
 

package Pseudocode;
import java.util.Scanner;
public class SortedList {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter three number");
		int num1,num2,num3;
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		if(num1<num2 && num1<num3)
		 {
			if(num2<num3)
				System.out.println("Sorted list is"+num1+" "+num2+" "+num3);
			else
				System.out.println("Sorted list is"+num1+" "+num3+" "+num2);
		 }
		  
		else if(num2<num1 && num2<num3) {
			if(num1<num3)
				System.out.println("Sorted list is"+num2+" "+num1+" "+num3);
			else
				System.out.println("Sorted list is"+num2+" "+num3+" "+num1);
		   }
		else if(num3<num1 && num3<num1) {
			if(num1<num2)
				System.out.println("Sorted list is"+num3+" "+num1+" "+num2);
			else
				System.out.println("Sorted list is"+num3+" "+num2+" "+num1);
		}
			
         
		 
		input.close();
	}
	
}
