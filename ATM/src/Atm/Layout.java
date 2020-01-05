package Atm;
import java.util.Scanner;

public class Layout {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to the Global Bank");
		input.close();
		Process p=new Process();
		p.welcome();				
	}
	
}
