package Assignment;

import java.util.Scanner;

public class Reserve {
	public static void main(String[] args) {
		
	     Reserve();
		}
		 static void Reserve() {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter a word");
			String string=input.next();
			char[] str =string.toCharArray();
			for(int i=str.length-1;i>=0;i--){
				System.out.print(str[i]);
			}
			
		}
}
