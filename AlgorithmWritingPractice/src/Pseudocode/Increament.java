/*
 * DECLARE num1 and num2
 * INPUT num1 and num2
 * IF num1 is greater than num2
 * 		FOR i<- num1 to length[num2]
 *   		num1<-num1+1
 *   		DISPLAY num1
 * ELSE
 * 		FOR i<-num2 to length[num1]
 *          num2<-num2+1
 *          DISPLAY num2*/

package Pseudocode;
import java.util.Scanner;
public class Increament {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter two number");
		int num1=input.nextInt();
		
		
		int num2=input.nextInt();
		if(num1<num2) {
			for(int i=num1;i<num2;i++)
			{
				num1=num1+1;
				System.out.println(num1);
			}
			
		}
		else {
			for(int i=num2;i<num1;i++)
			{
				num2=num2+1;
				System.out.println(num2);
			}
		}
		input.close();
	}

}
