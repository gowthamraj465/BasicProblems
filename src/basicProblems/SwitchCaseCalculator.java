package basicProblems;

import java.util.Scanner;

public class SwitchCaseCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scanner.nextInt();
		System.out.println("Enter the second number");
		int num2=scanner.nextInt();
		System.out.println("Enter the character");
		char operator = scanner.next().charAt(0);
		double result;
		switch (operator ) {
		case '+': 
			result = num1+num2;
			System.out.println(result);
			break;
		case '-':
			result = num1-num2;
			System.out.println(result);
			break;
		case '*':
			result = num1*num2;
			System.out.println(result);
			break;
		case '/':
			if (num2!=0) {
				System.out.println(num1/num2);	
			}	
		}
		
		
	}

}
