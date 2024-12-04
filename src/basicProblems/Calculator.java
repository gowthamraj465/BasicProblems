package basicProblems;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		double num2 = scanner.nextInt();
		System.out.println("Enter the character:");
		char operator = scanner.next().charAt(0);
		double result;
		if (operator == '+') {
		result = num1+num2;
			System.out.println("Result:"+result);
		}
		else if (operator == '-')
		{
			result = num1 - num2;
			System.out.println("Result :"+result);
		}
		else if(operator == '*') {
			result = num1 * num2;
			System.out.println("Result:"+result);
		}
		else if (operator == '/') {
			if (num2 != 0) {
				result = num1/num2;
				System.out.println("Result:"+result);
			}
			else {
				System.out.println("Error:Division by zero is not allowed");
			}
		}
		else {
			System.out.println("Invalid Operator");
		}
		scanner.close();
		
	}

}
