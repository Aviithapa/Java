package PostAndPre;
import java.util.Scanner;

public class Increament {
    public static void main(String[] args)
    {
    	Scanner name= new Scanner(System.in);
    	System.out.println("Enter the UserName");
    	String UserName=name.next();
    	System.out.println("Enter the Password");
    	String Password=name.next();
    	name.close();
    	if(UserName.equalsIgnoreCase("abhishek") && Password.equalsIgnoreCase("thapa"))
    	    System.out.println("Welcome "+ UserName + " " + "you are Login to your account");
       	else 
    		System.out.println("Username and Password doesnot Match");
    }
    
}
