package inheritance;
class G{
	public int sum(int a , int b) {
		return a+b;		
	}
	public double sum(double a , double b) {
		return a+b;
	}
	
}
class F extends G{	
	private int a,b,c;
	public F(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		}
 public int sum() {
		return a+b+c;
	}
}

public class MathOperation {
    public static void main(String[] args) {
    	F obj = new F(70,55,27);
    	int x=obj.sum();
    	System.out.println(x);
	}
}
