package loopExercises;

import java.util.Scanner;

public class DigitCounter {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the value : ");
		int v = scanner.nextInt();
		scanner.close();
		int count = 0;
		while (v != 0) {
			v/=10;
			count++;
		}
		System.out.println("Number of Digits "+count);
	}

}
