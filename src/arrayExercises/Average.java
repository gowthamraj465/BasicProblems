package arrayExercises;

public class Average {
	public static void main(String[] args) {
		int[] myArray = {13,8};
	    double sum = 0;
		for(int i=0;i<myArray.length;i++) {
			sum += myArray[i];
		}
		double average = sum/myArray.length;
		System.out.println("Average of the given Array : "+average);
	}

}
