package collections;
import java.util.ArrayList;
public class CloningArrayList {
	public static void main(String[] args) {
		ArrayList<Character> c1 = new ArrayList<>();
		c1.add('a');
		c1.add('b');
		c1.add('c');
		c1.add('d');
		ArrayList<Character> c2 = (ArrayList<Character>) c1.clone();
		System.out.println(c2);
	}

}
