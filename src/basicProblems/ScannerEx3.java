package basicProblems;

import java.util.Scanner;

public class ScannerEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is the capital of India ? ");
		String answer = scanner.nextLine();
		String correctAnswer = "NewDelhi";
		if (answer.equalsIgnoreCase(correctAnswer)) {
			System.out.println("your answer is correct");
		}
		else {
			System.out.println("your answer is wrong");
		}
			scanner.close();
	}

}
