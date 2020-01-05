package Tax;
import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input the income");
		int num=input.nextInt();
		int result=salary(num);
		System.out.println("The tax is "+" "+result);
		input.close();
		
		
	}
	
static int salary(int num) {
	  int amount1=0,amount2=0,amount3=0;
	  int result=0,result1=0,result2=0;
	  if(num<=400000)
		   result=Calculation(num,1);
	  
	  if(num>400000 && num<=500000) {
		   amount1=num-400000;
		   result=Calculation(400000,1);
		   result1=Calculation(amount1,20);
	  }
	  if(num>500000) {
		  amount3=num-500000;
		  result=Calculation(400000,1);
		  result1=Calculation(100000,20);
		 result2=Calculation(amount3,25);
	  }			

	return result+result1+result2;
}
	
static int Calculation(int num, int tax)
	{
		int result=(num*tax)/100;
		return result;
	}

}
