package inheritance;
class Shape{
	public double getArea() {
		return 0.0;
	}
	public double getPerimeter() {
		return 0.0;
	}
}
class circle extends Shape {
	private double radius;
	public circle(double radius) {
		this.radius = radius;		
	}
	public double getArea() {
		double area = Math.PI*(radius*radius);
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
}
class Square extends Shape{
	private int side ;
	public Square(int side) {
		this.side = side;
	}
	public double getArea() {
		double area = side*side;
		return area;
	}
	public double getPerimeter() {
         double perimeter = 4*side;
         return perimeter;
}
}
public class Area_Perimeter {
	public static void main(String[] args) {
		circle c1 = new circle(49);
		System.out.println("AREA OF CIRCLE : "+c1.getArea());
		System.out.println("PERIMETER OF CIRCLE : "+c1.getPerimeter());
		
		Square a = new Square(42);
			System.out.println("\nAREA OF SQUARE : "+a.getArea());
			System.out.println("PERIMETER OF SQUARE : "+a.getPerimeter());
		
	}

}
