package basicProblems;

public class Array {
public static void main(String[] args) {
	int[] numbers = {10,20,30,40,50,60};
	int max = numbers[0];
	int min = numbers[0];
	for (int i=1 ; i<numbers.length;i++) {
		if (numbers[i]>max) {
			max = numbers[i];
		}
		if (numbers[i]<min) {
			min = numbers[i];
		}
	}
	System.out.println("Maximum Value : "+max);
	System.out.println("Minimum Value : "+min);
	
	}
}
