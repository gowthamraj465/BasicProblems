package loopExercises;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE VAlUE OF 'N' : ");
		int N = scanner.nextInt();
		scanner.close();
		int sum = 0;
		for(int i=1;i<=N;i++) {
			sum += i;
		}
		System.out.println("The Sum of digits from 1 to "+N+" = "+sum);
	}
}
	