package arrayExercises;

public class Exercise5 {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			
			sum += numbers[i];
		}
		System.out.println("SUM OF ELEMENTS IN THE ARRAY : "+sum);
		
	}

}
