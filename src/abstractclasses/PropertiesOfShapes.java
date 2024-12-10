package abstractclasses;
abstract class Shape{
	String colour;
	
	abstract double area();
	
	public abstract String toString();
	
	public Shape(String colour) {
		 		 this.colour = colour;	 
	 }
	public String getColour() {
		return colour;
	}	
}
class Circle extends Shape {
	double radius;
	public Circle(String colour ,double radius) {
		super(colour);
		this.radius=radius;
	}
	double area() {
		return Math.PI*(radius*radius);
	}
	public String toString() {
		return "COLOUR OF THE CIRCLE IS : "+getColour()+"\nAREA OF THE CIRCLE IS : "+area();
	}	
}
class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(String colour,double length,double width ) {
		super(colour);
		this.length = length;
		this.width = width;
	}
	double area() {
		return length*width;
	}
	public String toString() {
		return "COLOUR OF THE RECTANGLE IS : "+getColour()+" \nAREA OF THE RECTANGLE IS : "+area();
	}
}
public class PropertiesOfShapes {
	public static void main(String[] args) {
		Circle c1 = new Circle("RED",25.5);
		Rectangle r1 = new Rectangle("BLUE",39,42);
		System.out.println(c1.toString());
		System.out.println(r1.toString());
	}

}
