package arrayExercises;

public class Exercise2 {
	public static void main(String[] args) {
		
	
	String[] cars = {"volvo","Benz","BMW","Tata"};
	// Length = index-1; (index number starts with zero)//
	/* for (int i=0;i<cars.length;i++) {
		System.out.print(cars[i]+",");	
	}*/
	for(String i:cars) {
		System.out.println(i);
	}
	}
}
