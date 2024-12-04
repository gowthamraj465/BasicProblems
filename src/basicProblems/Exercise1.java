package basicProblems;

public class Exercise1 {
   public static void main(String[] args) {
	   // Example1 (Even or Odd)//
	int num = 5;
	if(num%2==0) {
		System.out.println("The given number is even");
	}
	else
	{
		System.out.println("The number is odd");
	}
	// Example2 (Finding largest Number)//
	int a = 48,b=12,c=24;
	if (a>b && a>c) {
		System.out.println("a is the largest number");
	}
	else if(b>a && b>c) {
		System.out.println("b is the largest number"); 
	}
	else {
		System.out.println("c is the largest number");
	}
	// Example 3 (Positive or Negative)//
	int x=0;
	if (x>0) {
		System.out.println("given number is positve");
	}
	else if (x<0) {
		System.out.println("given number is negative");
		
	}
	else {
		System.out.println("given number is zero");
	}
}
}
