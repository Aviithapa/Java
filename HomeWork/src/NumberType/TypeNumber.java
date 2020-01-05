package NumberType;

import java.util.Scanner;

public class TypeNumber {

	public static void main(String[] args) {
 Scanner input= new Scanner(System.in);
 System.out.println("Enter a Number");
 int num=input.nextInt();
 if(num>=0)
 {
	 System.out.println(+num+" "+"is a positive number");
 }
 else
 {
	 System.out.println(+num+" "+"is a Negative number"); 
 }
 input.close();

	}

}
