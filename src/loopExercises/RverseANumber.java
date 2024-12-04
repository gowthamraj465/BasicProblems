package loopExercises;

public class RverseANumber {
	public static void main(String[] args) {
	int number = 196754328;
	int reversed = 0;
	while (number !=0 ) {
		int digit = number%10;
		reversed = reversed*10+digit;
		number /= 10;	
	}
	System.out.println("REVERSED NUMBER : "+reversed);
	}
}
