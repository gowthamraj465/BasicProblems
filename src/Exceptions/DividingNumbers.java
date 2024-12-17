package Exceptions;

public class DividingNumbers {
	public static int divideNumbers(int dividend,int divisor) {
		if(divisor == 0) {
			throw new ArithmeticException("CANNOT DIVIDE A NUMBER BY ZERO");
		}else {
		return dividend/divisor;
		}
	}
	public static void main(String[] args) {
		try {
			int result = divideNumbers(25,0);
			System.out.println("RESULT : "+result);
		}
		catch(Exception e) {
			System.out.println("ERROR! : "+e.getMessage());
		}
	}

}
