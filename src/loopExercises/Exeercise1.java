package loopExercises;

import java.util.Scanner;

public class Exeercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N : ");
		int N = scanner.nextInt();
		System.out.println("Numbers from 1 to "+N+" using while loop");
		/*for (int i=1;i<=N;i++) {
			System.out.println(i);
		}*/
		/*int i = 100;
		while (i>=N) {
			System.out.println(i);
			i-=10;			
		}*/
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=N);
		scanner.close();
	}

}
