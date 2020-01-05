package ReserveStringCharacter;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number");
		num=input.nextInt();
		Check(num);
		input.close();

	}
	static void Check(int num)
	{
		int reverve;
		if(num>=0 && num<=9)
			System.out.println("Palindrome Number");
		else if(num>=10) {
			int sum=0;
			sum=num+num;
			reverve=reserve(sum);
			if(sum==reverve) {
				System.out.println(+num+" "+"is a palindrome Number");
			}
			else
				System.out.println(+num+" "+"is not a palindrome Number");
		}
		else
			System.out.println("Invalid Number");
	}
	static int reserve(int sum) {
		int reversed=0;
		while(sum != 0) {
            int digit = sum % 10;
            reversed = reversed * 10 + digit;
            sum /= 10;
        }
       return reversed;
	}
}
