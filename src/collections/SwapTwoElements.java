package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {
	public static void main(String[] args) {
		ArrayList<String> bikes = new ArrayList<>();
		bikes.add("DUCATI");
		bikes.add("HARLEY DAVIDSON");
		bikes.add("HONDA CBR");
		bikes.add("KAWASAKI");
		System.out.println("BEFORE SWAPPING : ");
		for(String a : bikes) {
			System.out.println(a);
		}
		Collections.swap(bikes, 0, 3);
		System.out.println("AFTER SWAPPING : ");
		for(String b: bikes) {
			System.out.println(b);
		}
	}

}
