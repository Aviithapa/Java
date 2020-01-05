package PostAndPre;

public class Smallest {
 public static void main(String[] args) {
	 int myArray[]= {30,6,30,90,6,30,4,6};
     int min;
     min = myArray[0];   
     
	 for(int i=1;i<myArray.length;i++) {
		 
	           if(min<myArray[i])
	        	min = myArray[i];
	           
	         
		 
		 }
	  System.out.println("Largest element is: "+min);
     
 }
		 
}

public class calculate{
	int n1,n2,result;
	
	public int sum()
	{
		result=n1+n2;
		return result;
	}
	public int subtract()
	{
		result=n1-n2;
		return result;
		
	}
	public int division()
	{
		result=n1/n2;
		return result;
	}
	public int multiply()
	{
		result=n1*n2;
		return result;
	}
}
