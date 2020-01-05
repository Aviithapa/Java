package Assignment;



public class Binary {

	  int binarySearch(int arr[], int l, int r, int n) 
	    { 
	        if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	  
	            if (arr[mid] == n) 
	                return mid; 
	  
	       
	            if (arr[mid] > n) 
	                return binarySearch(arr, l, mid - 1, n); 
	  
	          
	            return binarySearch(arr, mid + 1, r, n); 
	        } 
	  
	    
	        return -1; 
	    } 
	  
	   
	    public static void main(String args[]) 
	    { 
	    	
	        Binary b = new Binary(); 
	        int arr[] = { 10,20,30,40,50,60,70}; 
	       
	        int ans = b.binarySearch(arr, 0, arr.length - 1, 10); 
	        if (ans == -1) 
	            System.out.println("not found "); 
	        else
	            System.out.println(" found at index " + ans); 
	    } 
}
