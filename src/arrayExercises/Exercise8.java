package arrayExercises;

public class Exercise8 {
	public static void main(String[] args) {
		String[][] vehicles = { {"volvo","BMW","Benz","jaguar","TATA","KIA"},
				                {"RoyalEnfield","KTM","Honda","Benelli"}
		                      };
		 for (int i=0;i<vehicles.length;i++) {
			 for (int j=0;j<vehicles[i].length;j++) {
				 System.out.print(vehicles[i][j]+" ");
			 }
			 System.out.println();
		 }
		/*for(String[] V : vehicles) {
			for(String i : V) {
				System.out.print(i+" ");
			}
			System.out.println();
		} */
	}

}
