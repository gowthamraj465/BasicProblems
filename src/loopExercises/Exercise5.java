package loopExercises;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE VAlUE : ");
		int value = scanner.nextInt();
		int reversed = 0;
		while (value!=0) {
			int digit = value%10;                  //extracts the last digit
			reversed = reversed*10+digit;         //add the digit to the reversed number
			value = value/10;                    //to remove the last digit
		}
		System.out.println("Reversed Value : "+reversed);
		scanner.close();
	}
}
