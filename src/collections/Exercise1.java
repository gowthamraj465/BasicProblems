package collections;

import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("RED");
		colors.add("BLUE");
		colors.add("GREEN");
		colors.add("WHITE");
		colors.add("YELLOW");
		colors.add("BLACK");
		System.out.println("LIST BEFORE SORTING : "+colors);
		Collections.sort(colors);
		System.out.println("LIST AFTER SORTING : "+colors);
		
	}

}
