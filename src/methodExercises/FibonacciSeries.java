package methodExercises;

public class FibonacciSeries {
	static int fibonacci(int n) {
		if (n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		} 
		return fibonacci(n-1)+fibonacci(n-2);
	}
public static void main(String[] args) {
	int n = 10;
	int result = fibonacci(n);
	System.out.println(result);
}
}
