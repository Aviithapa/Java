package Atm;

import java.util.Scanner;

public class Process {
 
	
	 public static void main(String[] args) {
		 Process p=new Process();
		 p.welcome();
	 }
	 public void welcome()
	 {
		 System.out.println("Enter your name");
		 Scanner input=new Scanner(System.in);
		 String name=input.next();
		 System.out.println("Hey"+name+"Which is your account");
		 System.out.println("1  Current /n"
		 		+ "2  Saving");
		 input.close();
		 
	 }
}
