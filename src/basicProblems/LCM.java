package basicProblems;

public class LCM {
	static int gcd(int a,int b) {
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;			
		}
		return a;
	}
	static int lcm(int a,int b) {
		return (a*b)/gcd(a,b);
	}
	 
	public static void main(String[] args) {
		int a = 12,b=84;
		int x = lcm(a,b);
		System.out.println("LEAST COMMON MULTIPLE : " + x);
		
	}
		
	}
	

