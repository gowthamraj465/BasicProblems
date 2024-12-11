package abstractclasses;
abstract class Shape3D {
	public abstract double calculateVolume();
	public abstract double calculateSurfaceArea();
}
class Sphere extends Shape3D{
	private double radius;
	public Sphere(double radius) {
		this.radius = radius;
	}
	public double calculateVolume() {
		return (4/3)*Math.PI*Math.pow(radius,3);
	}
	public double calculateSurfaceArea() {
		return (4*Math.PI*Math.pow(radius, 2));
	}	
}
class Cube extends Shape3D{
	private double sideLength;
	public Cube(double sideLength) {
		this.sideLength = sideLength;
	}
	public double calculateVolume() {
		return Math.pow(sideLength, 3);
	}
	public double calculateSurfaceArea() {
		return 6*Math.pow(sideLength,2);
	}
	
	
}

public class VolumeandSurfacearea {
public static void main(String[] args) {
	Shape3D s1 = new Sphere(28.00);
	Shape3D s2 = new Cube(52.00);
    double volume = s1.calculateVolume();
    double surfaceArea = s1.calculateSurfaceArea();
    System.out.println("VOLUME OF SPHERE : "+volume);
    System.out.println("SURFACEAREA OF SPHERE : "+surfaceArea);
    volume = s2.calculateVolume();
    surfaceArea = s2.calculateSurfaceArea();
    System.out.println("VOLUME OF CUBE : "+volume);
    System.out.println("SURFACEAREA OF CUBE : "+surfaceArea);
    
}
}
