package StudentInformation;
import java.util.Scanner;
public class StudentInformation {

	public static void main(String[] args)
	{
		Scanner info=new Scanner(System.in);
		 System.out.println("Enter the Student first name:");
		 String firstname=info.next();
		 System.out.println("Enter the Student last name:");
		 String lastname=info.next();
		 System.out.println("Enter the age of the student:");
		 int age=info.nextInt();
		 System.out.println("Hello"+" "+firstname+lastname+age+" "+"Nice to  meet you");
	}
}
