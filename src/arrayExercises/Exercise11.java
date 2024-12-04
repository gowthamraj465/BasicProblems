package arrayExercises;

public class Exercise11 {
	public static void main(String[] args) {
		//FINDING DUPLICATE ELEMENT IN AN ARRAY//
		String[] cars = {"FERRARI","AUDI","BMW","FORD","FERRARI"};
		System.out.println("DUPLICATE ELEMENT IS: ");
		boolean state = true;
		for (int i=0;i<cars.length;i++) {
			for (int j=i+1 ; j<cars.length;j++) {
				if(cars[i] == cars[j]) {
					System.out.println(cars[i]);
					state = false;
					break;
				}
			}
			
		}
		
		
		if(state) {
			System.out.println("DUPLICATE ELEMENT NOT FOUND");
		}
		

}
}