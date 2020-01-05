/*
 * INPUT two numbers
 * IF num1%num2=0
 * 		DISPLAY num1 is multiple of num2
 * ELSE IF num2%num1=0
 * 		DISPLAY num2 is multiple of num1
 * ELSE
 * 		DISPLAY number are not multiple */

package Pseudocode;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		if(num1%num2==0)
		System.out.println(num1 +" "+" is multiple of "+" "+num2);
		else if(num2%num1==0)
			System.out.println(num2 +" "+" is multiple of "+" "+num1);
		else
			System.out.println("number are not multiple of each other");
		
		input.close();
	}
	
}
