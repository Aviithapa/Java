package Week1;

import java.util.Scanner;

public class ReserveCharacterOfString {

	public static void main(String[] args) {
		
     ReverseStringCharacter();
	}
	 static void ReverseStringCharacter() {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a word");
		String word=input.next();
		char[] reverse =word.toCharArray();
		int length=reverse.length;
		for(int i=length-1;i>=0;i--){
			System.out.print(reverse[i]);
		}
		
		input.close();
	}
}
