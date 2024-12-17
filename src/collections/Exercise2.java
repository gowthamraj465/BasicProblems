package collections;
import java.util.*;
public class Exercise2 {
	public static void main(String[] args) {
		ArrayList info = new ArrayList();
		info.add(24);
		info.add("GOWTHAM");
		info.add('A');
		info.add(12.248);
		info.add(true);
		if(info.contains(12.248))
		{
			System.out.println("ELEMENT FOUNDED");			
		}else {
			System.out.println("ELEMENT NOT FOUNDED");
		}
	}

}
