package loopExercises;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num = scanner.nextInt();
		for (int i=1;i<=20;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
		scanner.close();
	}

}
