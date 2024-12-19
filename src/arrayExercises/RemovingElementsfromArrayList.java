package arrayExercises;

import java.util.ArrayList;

public class RemovingElementsfromArrayList {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("VOLVO");
		cars.add("MERCEDES");
		cars.add("VOLKSWAGEN");
		cars.add("SKODA");
		System.out.println("ORGINAL LIST : "+cars);
		String removed = cars.remove(2);
		System.out.println("REMOVED VALUE FROM THE LIST : "+removed);
		System.out.println("NEW LIST : "+cars);
	}

}
