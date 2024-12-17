package Exceptions;

public class OddorEven {
	public static void checkOdd(int num){
		if(num%2 != 0) {
			throw new IllegalArgumentException(num+"is odd");
		}
	}
public static void checkEven(int n) {
	try {
		checkOdd(n);
		System.out.println(n+" is Even");
	}
	catch(IllegalArgumentException e) {
		System.out.println("ERROR! : "+e.getMessage());
	}
}
public static void main(String[] args) {
	int n = 20;
	checkEven(n);
	 int a =9;
	checkEven(a);
	
}
}
