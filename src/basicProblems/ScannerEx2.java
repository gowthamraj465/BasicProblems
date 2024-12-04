package basicProblems;
import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt(); 
		
		if (num%2==0) {
			System.out.println("given number is an even number");
		}
		else {
			System.out.println("given number is odd");
		} 
		scanner.close();
	}

}
