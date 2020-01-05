/*
 * START
 * DECLARE arr
 * DECLARE arr1 
 * DECLARE arrlength
 * REVERSE the array
 * USE the reverse logic
 * DISPLAY arr1[k]
 * END*/

package ReverseArray;


public class ReverseArray {

	 public static void main(String[] args)
	 {
		 int [] arr = {10, 20, 30, 40, 50,60}; 
		 int[] arr1 = new int[arr.length];
	     int arrlength = arr.length;
	        for (int i = 0; i < arr.length; i++) { 
	            arr1[arrlength - 1] = arr[i]; 
	            arrlength = arrlength - 1; 
	        } 
	        System.out.println("The reverse of the array is:"); 
	        for (int k = 0; k < arr.length; k++) { 
	            System.out.println(arr1[k]); 
	        } 
		  
		  
	 }
	
}
