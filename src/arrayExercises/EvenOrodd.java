package arrayExercises;

public class EvenOrodd {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8};
		for (int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				System.out.println(numbers[i]+"is even");			
			}
			else {
				System.out.println(numbers[i]+"is odd");
			}
			
		} 
		
		
	}
	

}
