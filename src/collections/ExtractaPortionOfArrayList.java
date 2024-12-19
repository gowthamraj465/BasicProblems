package collections;

import java.util.*;

public class ExtractaPortionOfArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> orginalList = new ArrayList<>();
		orginalList.add(1);
		orginalList.add(2);
		orginalList.add(3);
		orginalList.add(4);
		orginalList.add(5);
		orginalList.add(6);
		List<Integer> sub_List =orginalList.subList(1,4);
		System.out.println(sub_List);
		//ArrayList<Integer> newList = new ArrayList<>(orginalList.subList(1, 4));
		//System.out.println(orginalList);
	}

}
