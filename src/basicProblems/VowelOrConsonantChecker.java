package basicProblems;
import java.util.Scanner;

public class VowelOrConsonantChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Letter");
		char letter = scanner.next().toLowerCase().charAt(0);
		
		if (letter >= 'a' && letter <= 'z') {
			switch(letter) {
				case 'a' : 
				case 'e' :
				case 'i' :
				case 'o' :
				case 'u' :
					System.out.println(letter+"is a vowel");
					break;
				default :
					System.out.println(letter+"is a consonant");
					
			}
			
		}
		else {
			
		
			System.out.println("ERROR:Invalid Input");
		
		}
		
		scanner.close();
	}

}
