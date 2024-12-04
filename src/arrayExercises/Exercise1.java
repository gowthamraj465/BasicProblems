package arrayExercises;

public class Exercise1 {
	public static void main(String[] args) {
		//APPROACH 1//
  int number[] = new int[5];
		number[0]=10;
		number[1]=20;
		number[2]=30;
		number[3]=40;
		number[4]=50; 
		
		//APPROACH 2//
		/*int[] number= {10,20,30,40,50};
		System.out.println(number[4]);*/
		
		
		/*System.out.println(number.length);
		System.out.println(number[4]);*/
		for(int i=0;i<number.length;i++) {
			System.out.println("The Element of index "+i+" : "+number[i]);
		}
		
	}

}
