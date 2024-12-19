package collections;

import java.util.ArrayList;


public class CopyOneArrayListtoAnother {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(8);
		numbers.add(16);
		ArrayList<Integer> newNumbers = new ArrayList<>();
		newNumbers.addAll(numbers);
		System.out.println(newNumbers);
	}

}
