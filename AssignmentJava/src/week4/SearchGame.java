package week4;

import java.util.Scanner;
import java.util.Random;

public class SearchGame {

	public static void main(String[] args) {
		int numGussed,numToGuess,numOfTries=0;
		boolean win =false;
		Random rand=new Random();
		numToGuess=rand.nextInt(20000);
		Scanner input=new Scanner(System.in);
		
		
		while (win==false) {
			System.out.println("Guess  a number between 1 to 20000");
			numGussed=input.nextInt();
			numOfTries++;
			if(numGussed>20000 || numGussed<0) {
				System.out.println("You have choosed over limit number");
			}
			else {
			if(numGussed == numToGuess) {
				win=true;
			}
			else if(numGussed<numToGuess) {
				System.out.println("Your number is less than the number");
			}
			else if(numGussed>numToGuess) {
				System.out.println("Your number is greater than guessing number");
			}
			}
		}
		
		System.out.println("Winner");
		System.out.println("The number is" +numToGuess);
		System.out.println("It takes you"+numOfTries+"tries");
        
	}

}
