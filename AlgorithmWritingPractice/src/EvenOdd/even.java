/*
 * START
 * DECLARE num
 * INPUT num
 * IF num%2=0 THEN 
 *    DISPLAY "even"
 * ELSE 
 *    DISPLAY "odd"
 * END
 * */




package EvenOdd;
import java.util.Scanner;
public class even {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=in.nextInt();
		if(num%2==0)
		System.out.println(" even number");
		else
			System.out.println(" odd number");
	}
	
}
