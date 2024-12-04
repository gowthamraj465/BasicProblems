package methodExercises;

public class SumofDigits {
	static int digits_Sum(int n) {
		int result = 0;
		while(n>0) {
			int digit = n%10;
			result += digit;
			n /= 10;
		}
		return result;
	}
	public static void main(String[] args) {
		int answer = digits_Sum(23456);
		System.out.println(answer);
	}

}
