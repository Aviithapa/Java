package ReserveStringCharacter;
import java.util.Scanner;
public class Polonomial {

	public static void main(String[] args) { 
	       
        int Polynum1[] = {10, 15, 0, 0}; 
        int Polynum2[] = {0,10, 20, 0}; 
        int Polynum1length = Polynum1.length; 
        int Polynum2length = Polynum2.length; 
         
        int sum[] = sum(Polynum1, Polynum2, Polynum1length, Polynum2length); 
        int size = max(Polynum1length, Polynum1length); 
        System.out.println("\nsum polynomial is"); 
        printPoly(sum, size); 
  
    } 
    static int max(int m, int n) { 
        return (m > n) ? m : n; 
    } 
  

    static int[] sum(int Polynum1[], int Polynum2[], int Polynum1length, int Polynum2length) { 
        int size = max(Polynum1length, Polynum2length); 
        int sum[] = new int[size]; 
  
  
        for (int i = 0; i < Polynum1length; i++) { 
            sum[i] = Polynum1[i]; 
        } 
  
  
        for (int i = 0; i < Polynum2length; i++) { 
            sum[i] += Polynum2[i]; 
        } 
  
        return sum; 
    } 
  

    static void printPoly(int poly[], int n) { 
        for (int i = 0; i < n; i++) { 
            System.out.print(poly[i]); 
            if (i != 0) { 
                System.out.print("x^" + i); 
            } 
            if (i != n - 1) { 
                System.out.print(" + "); 
            } 
        } 
    } 
  
  
    
}

