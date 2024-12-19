package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();
		colours.add("Black");
		colours.add("White");
		colours.add("Red");
		colours.add("Violet");
		//Collections.sort(colours);
		Collections.reverse(colours);
		
		//System.out.println("SORTED ARRAY : "+colours);	
		System.out.println("REVERSED ARRAY : "+colours);
	}

}
