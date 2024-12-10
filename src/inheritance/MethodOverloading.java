package inheritance;
public class MethodOverloading {
	
	public int sum(int x,int y) {
		return x+y;
	}
	public int sum(int x,int y,int z) {
		return x+y+z;
	}
	public double sum(double x,double y,double z) {
	return x+y+z;
	}
public static void main(String[] args) {
	MethodOverloading obj = new MethodOverloading();
	int x = obj.sum(12345, 9876);
	System.out.println("SUM OF TWO INTEGERS : "+x);
	
	int y = obj.sum(59, 442, 248);
	System.out.println("SUM OF THREE INTEGERS : "+y);
	
	double z = obj.sum(21.98, 34.56, 58.42);
	System.out.println("SUM OF THREE DECIMALS : "+z);
}
}
