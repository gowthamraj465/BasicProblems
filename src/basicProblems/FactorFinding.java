package basicProblems;

public class FactorFinding {
	public static void main(String[] args) {
		
		/*for (int i=1;i<=num;i++) {
			if (num%i==0) {
				System.out.println(i+" is a factor");
			}
		}*/
	/*	int i = 1;
		while(i<= num) {
			if (num% i ==0) {
				System.out.println(i+"is a factor");
				i++;
				
			}*/
		int num = 60;
		int i=1;
		
		do {
			if (num%i==0) {
			System.out.println(i+"is a factor");
			}
			i++;
		}while(i<= num);
	}

}
