package inheritance;
class Shape{
	public double getArea() {
		return 0.0;
	}
}
class Rectangle extends Shape{
	private double length;
	private double breadth;
	 
	public Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double getArea() {
		return length*breadth;
	}

}
public class AreaOfRectangle {
 public static void main(String[] args) {
	Rectangle R1 = new Rectangle(12,28);
	double area = R1.getArea();
	System.out.println("AREA OF RECTANGLE : "+area);
	
}
	

}
