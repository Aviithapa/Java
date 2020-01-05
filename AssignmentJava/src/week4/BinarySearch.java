package week4;

public class BinarySearch {
    int binarySearch(int arr[], int index, int length, int num) 
    { 
        if (length >= index) { 
            int mid = index + (length - index) / 2; 
  
            if (arr[mid] == num) 
                return mid; 
  
       
            if (arr[mid] > num) 
                return binarySearch(arr, index, mid - 1, num); 
  
          
            return binarySearch(arr, mid + 1, length, num); 
        } 
  
    
        return -1; 
    } 
  
   
    public static void main(String args[]) 
    { 
    	int num,length;
        BinarySearch BS = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40,50,60,70,80 }; 
       length = arr.length; 
        num = 10; 
        int result = BS.binarySearch(arr, 0, length - 1, num); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}
