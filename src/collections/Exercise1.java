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
		/*if(colors.contains("white")) {
			System.out.println("Color was Founded!");
		}else {
			System.out.println("Color was NotFound! ");
		}
		
		/*System.out.println("LIST BEFORE SORTING : "+colors);
		Collections.sort(colors);
		System.out.println("LIST AFTER SORTING : "+colors);*/
		//colors.removeAll(colors);
		//colors.clear();
		System.out.println(colors);
		System.out.println("Is Empty : "+colors.isEmpty());
		for(int i=0;i<colors.size();i++) {
			System.out.println(colors.get(i));
		}
		
	}

}
