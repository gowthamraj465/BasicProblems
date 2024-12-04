package arrayExercises;

public class PassingAnArrayToMethod {
	
	static void minimum(int arr[]) {
		
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if (arr[i]<min) {
				min = arr[i];
				
				}
		}
		
		System.out.println("MINIMUM VALUE IS : "+min);
	}
	public static void main(String[] args) {
		int numbers[] = {10,20,45,58,69,8,75};
		minimum(numbers);
	}

}
 