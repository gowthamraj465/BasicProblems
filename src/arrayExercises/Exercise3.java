package arrayExercises;

public class Exercise3 {
	//TWO DIMENSIONAL ARRAYS//
	public static void main(String[] args) {
    //DECLARATION//
		int[][] a = { {10,20},{30,40},{50,60} };
		System.out.println(a[2][1]); //IDENTIFYIENG VALUE OF ELEMENTS//
		System.out.println(a.length); //LENGTH OF ROWS//
		System.out.println(a[0].length);//LENGTH OF COLOUMNS//
	  
		// LOOPING OF TWO DIMENSIONAL ARRAYS//
		
		//1.FOR LOOP//
		/*for (int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
				System.out.print(a[r][c]+"  " );
				
			}
			System.out.println();		
		} */
		//FOR-EACH LOOP//
		 for(int[] x : a) {
			 for (int y : x) {
				 System.out.print(y+" ");
			 }
			 System.out.println();
		 }
		
	}

}
