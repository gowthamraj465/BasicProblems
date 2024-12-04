package basicProblems;
import java.util.Scanner;

public class Alphabhet {
	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a single character: ");
		        char ch = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for simplicity

		        // Check if it's a letter
		        if (ch >= 'a' && ch <= 'z') {
		            // Use a switch statement to check for vowels
		            switch (ch) {
		                case 'a':
		                case 'e':
		                case 'i':
		                case 'o':
		                case 'u':
		                    System.out.println(ch + " is a vowel.");
		                    break;
		                default:
		                    System.out.println(ch + " is a consonant.");
		            }
		        } else {
		            System.out.println("Error: Invalid input. Please enter an alphabetic character.");
		        }

		        scanner.close();

	}

}
