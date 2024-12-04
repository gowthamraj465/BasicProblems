package methodExercises;

public class isEven {
	static  void oddOrEven(int num) {
	if (num%2==0) {
		System.out.println("the given number is even ");
	} else {
		System.out.println("the given number is odd ");
	}
	}
	public static void main(String[] args) {
		int number = 5;
		oddOrEven(number);
	}
}
	