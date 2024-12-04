package loopExercises;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the Number of Terms :");
		int n = scanner.nextInt();
		scanner.close();
		int firstTerm=0,secondTerm=1;
		System.out.print("FIBONACCI SERIES "+firstTerm+","+secondTerm);
		for(int i=3;i<=n;i++) {
			int nextTerm = firstTerm+secondTerm;
			System.out.print(","+nextTerm);
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		
		
		
	}

}
