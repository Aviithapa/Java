package Service;

import java.util.Scanner;
public class Service {

	public void Inquire() {
		 System.out.println("1. Inquiry \n2. Ticket Booking");
		 System.out.println("Choose a Service according num");
		 Scanner input=new Scanner(System.in);
		 int option=input.nextInt();
		 try {
		 if(option==1)
		 {
			 Service s=new Service();
			 s.Inquiry();
		 }
		 else if(option==2)
		 {
			 Service s=new Service();
			 s.Ticket();
		 }
		 else
		 {
			 System.out.println("Invalid option \nTry to input a valid option");
			 Inquire();
		 }
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
	  input.close();
	}
	
	void Inquiry() {
		System.out.println("What do you want to know about?");
		System.out.println("1. Route \n2. Bus Timing \n3.");
	}
	
	void Ticket() {
		System.out.println("We use two medium for Travelling ");
		System.out.println("1. Air Way \n2. Road Way \nPlease Choose your Travelling Medium");
		Scanner input=new Scanner(System.in);
		int selection=input.nextInt();
		try {
			if(selection==1)
			{
		      Airway();		
			}
			else if(selection==2)
			{
			 Roadway();	
			}else
			{
				System.out.println("Invalid Input");
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("Please select your starting point");
		System.out.println("1. Kathmandu \n2. Chitwan \n3 Butwal \n4 Pokhara \n5 Nepalgung \n6 Karnali \n7 Dhangadhi \n8 Kanchanpur \n9 Baitadi");
	}
	
	void Airway() {
		Scanner input=new Scanner(System.in);
		System.out.println("We have particular Place only for Airway they are:");
		System.out.println("1. Kathmandu \n2. Pokhara \n3. Dhangadhi \n4 Neepalgung");
		System.out.println("Please input your Starting point");
		int starting=input.nextInt();
		switch(starting) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
	    default:
	    	System.out.println("Invalid input");
	    	break;
				
		}
	}
	void Roadway() {
		
	}
}
