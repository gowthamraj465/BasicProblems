package arrayExercises;

public class Exercise4 {
	public static void main(String[] args) {
		String[] bikes = {"Honda","Yamaha","RoyalEnfield","Kawasaki","Jawa"};
		System.out.println(bikes.length);
		/* for( int i=0;i<bikes.length;i++) {
			System.out.println(i); 
		} */
		System.out.println("Elements of the array are:");
		for(String i : bikes)  {
			System.out.println(i);
		}
		
	}

}
