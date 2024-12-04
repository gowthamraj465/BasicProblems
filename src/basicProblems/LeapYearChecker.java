package basicProblems;

import java.util.Scanner;


public class LeapYearChecker {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the year:");
	int year = scanner.nextInt();
	if ((year%4==0 && year%100 != 0)||(year%400==0)) {
		System.out.println("yes it's a leapyear");
	}
	else {
		System.out.println("No it is not a leap year");
	}
	
	scanner.close();
	
	
	}
}
