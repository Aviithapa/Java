package SumArray;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 int[] array = new int[5];
	      int sum = 0;
	      System.out.println("Enter the elements:");
	      for (int i=0; i<5; i++)
	      {
	    	  array[i] = input.nextInt();
	      }
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum is:"+sum);
	      
	      input.close();
	}

}
