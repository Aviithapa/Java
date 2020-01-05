package ReserveStringCharacter;
 
 import java.util.Scanner;
public class ReserveStringCharacter {

	public static void main(String[] args) {
		new ReserveStringCharacter();

	}
	public ReserveStringCharacter() {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a word");
		String word=input.next();
		char[] reserve=word.toCharArray();
		int length=reserve.length;
		for(int i=length-1;i>=0;i--){
			System.out.print(reserve[i]);
			
		}
		
		input.close();
	}

}
