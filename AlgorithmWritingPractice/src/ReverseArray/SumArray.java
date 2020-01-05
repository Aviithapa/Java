/*
 * START
 * DECLARE arr
 * DECLARE sum
 * INPUT number
 * sum = sum+ num;
 * DISPLAY sum
 * END*/


package ReverseArray;
import java.util.Scanner;
public class SumArray {

	  public static void main(String[] args)
	  {
		  Scanner input= new Scanner(System.in);
		  int[] arr = new int[20];
	      int sum = 0;
	      System.out.println("Enter the elements:");
	      for (int i=0; i<20; i++)
	      {
	    	  arr[i] = input.nextInt();
	      }
	      for( int num : arr) {
	          sum = sum+num;
	      }
	      System.out.println("The sum of all the element in the array  is:"+sum);
	      
		  
		  input.close();
	  } 
}
