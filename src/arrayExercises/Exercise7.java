package arrayExercises;

public class Exercise7 {
	public static void main(String[] args) {
		
	
	int[] x = {1,2,3,4,5,6,7,8};
	/* for(int i=0;i<x.length;i++) {
		switch (i) {
		case 0 : System.out.println("ELEMENT1 : "+x[i]);
		break;
		case 1 : System.out.println("ELEMENT2 : "+x[i]);
		break;
		case 2 : System.out.println("ELEMENT3 : "+x[i]);
		break;
		}*/
	for (int i : x) {
		System.out.println(i);
		
	}
	
	}
}
