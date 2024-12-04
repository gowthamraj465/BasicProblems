package basicProblems;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Height :");
		double height = scanner.nextDouble();
		System.out.println("Enter your weight");
		double weight = scanner.nextDouble();
		double calculation = weight/height*height ;
		System.out.println("Your BMI is :"+calculation);
		scanner.close();
	}
	

}
