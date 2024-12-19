package collections;
import java.util.*;

public class IncreasingSize {
	public static void main(String[] args) {
		ArrayList<Character> letters = new ArrayList<>();
		letters.ensureCapacity(6);
		letters.add('a');
		letters.add('b');
		letters.add('c');
		letters.add('e');
		
		System.out.println(letters);
		letters.trimToSize();
		System.out.println(letters);
	}

}
