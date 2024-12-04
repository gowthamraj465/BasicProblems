package loopExercises;

import java.util.Scanner;

public class LargestAmong3Numbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of X : ");
		int X = scanner.nextInt();
		System.out.println("Enter the value of Y : ");
		int Y = scanner.nextInt();
		System.out.println("Enter the value of Z : ");
		int Z =  scanner.nextInt();
		int largest;
		if (X>Y && X>Z) {
			largest = X;
		}
		else if (Y>X && Y>Z) {
			largest = Y;
		}
		else {
		    largest = Z;
		}
		System.out.println("The largest Number is :"+largest);
		
		scanner.close();
	}

}
