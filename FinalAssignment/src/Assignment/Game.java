package Assignment;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
	int ToGuess,Tries=0;
	boolean win =false;
	Random rand=new Random();
	int Guess=rand.nextInt(20000);
	Scanner number=new Scanner(System.in);

	
	while (win==false) {
		System.out.println("Guess  a number between 1 to 20000");
		ToGuess=number.nextInt();
		Tries++;

		if(Guess == ToGuess) {
			win=true;
		}
		else if(Guess<ToGuess) {
			System.out.println("Your number is less than the number");
		}
		else if(Guess>ToGuess) {
			System.out.println("Your number is greater than guessing number");
		}
		
	}
	
	System.out.println("Winner");
	
    
}
}
