package basicProblems;

import java.util.Scanner;
		public class ScannerClass {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the value of a: ");
				int a = scanner.nextInt();
				System.out.println("Enter the value of b: ");
				int b = scanner.nextInt();
				int c = a*b;
				System.out.println("The product value is :"+c);
				scanner.close();
			}
		}