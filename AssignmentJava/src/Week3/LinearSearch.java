package Week3;

import java.util.Scanner;

public class LinearSearch { 
     
     static int linSearch(int arr[], int index, int length, int num) 
     { 
          if (length < index) 
             return -1; 
          if (arr[index] == num) 
             return index; 
          if (arr[length] == num) 
             return length; 
          return linSearch(arr, index+1, length-1, num); 
     } 
       
   
     public static void main(String[] args)  
     { 
    	 int arr[] = {12, 34, 54, 2, 3};
    	 int num,length;
    	 System.out.println("Enter the number you want to search?");
    	 Scanner input=new Scanner(System.in);
         num=input.nextInt();
         input.close();
         length=arr.length-1;
          
        int index = linSearch(arr, 0, length, num); 
        if (index != -1) 
           System.out.println(num + " is present at index " +index); 
        else
            System.out.println(num + " is not present"); 
        } 

}
