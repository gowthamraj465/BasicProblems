package arrayExercises;

public class Exercise10 {
	public static void main(String[] args) {
		//FINDING MISSING ELEMENT IN AN ARRAY//
		/* PREREQUISITES
		 * (1) Array should not have any duplicate values.
		 * (2) Array elements should be in a "Range".
		 * (3) Array dont need to be in a sorted format.
		 */
		int[] numbers = {1,2,4,5,6};
		int sum1 = 0;
		for (int i=1;i<=6;i++) {
			sum1 += i;
		}
		int sum2 = 0;
		for (int i=0;i<numbers.length;i++) {
			sum2 += numbers[i];
			}
		System.out.println("Missing Element is "+(sum1-sum2));
	}

}
