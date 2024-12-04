package arrayExercises;
import java.util.Arrays;

public class Exercise9 {
	public static void main(String[] args) {
		
	//CHECKING WHETHER TWO ARRAYS ARE EQUAL OR NOT//
	int[] a1 = {1,2,3,4,5,6};
	int[] a2 = {1,2,3,4,5,8};
	boolean status = Arrays.equals(a1,a2);
	/*if (a1.length == a2.length) {
		for (int i=0;i<a2.length;i++) {
			if (a1[i]==a2[i])
			{
				status = true;
			}
			else {
				status = false ;
			}
		}
		}
	else
	{
		status = false;
	}*/
	if (status) {
	System.out.println("Arrays are Equal");
	}
	else {
		System.out.println("Arrays are NotEqual");
	} 
	
	}	
}
