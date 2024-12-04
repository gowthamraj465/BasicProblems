package arrayExercises;

public class CloningOfArry {
	public static void main(String[] args) {
		
	int[] arr = {1,2,3,4,5,6};
	System.out.println("Printing the orginal array");
	for(int i : arr) 
		System.out.println(i);
	int[] arr1 = arr.clone();
	System.out.println("Printing the clone of the array");
	for (int x:arr1)
		System.out.println(x);
	System.out.println("Are both arrays are equal");
	System.out.println(arr==arr1);
	}
}
