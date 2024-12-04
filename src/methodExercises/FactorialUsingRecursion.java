package methodExercises;

public class FactorialUsingRecursion {
	/* static int factorial(int x) {
		if (x>0) {
			return x*factorial(x-1);
		}else 
			return 1;
		
	}
	public static void main(String[] args) {
	  int answer = factorial(10);
	  System.out.println(answer);
	}*/
		/*int number = 30,factorial=1;
		for (int i=1;i<=number;i++) {
		factorial =factorial*i ;
	}*/
		static int factorial (int n) {
			if(n==0) {
				return 1;
			}else {
				return (n*factorial(n-1));
			}
		}
		public static void main(String[] args) {
			  int answer = factorial(22);
			  System.out.println("Factorial of the given number is : "+answer);
		}
	

}
