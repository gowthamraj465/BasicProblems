package inheritance;

public class Car extends Vehicle {
	private String modelName = "mustang";
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.accelerate();
		System.out.println(myCar.brand+" "+ myCar.modelName);
		
	}

}
