package abstractclasses;
abstract class Bike{
	Bike(){
		System.out.println("Bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("gear changed");
	}
}
class Honda extends Bike{
	void run() {
		System.out.println("Running Safely");
	}
}

public class BikeProperties {
	public static void main(String[] args) {
		Honda cbr = new Honda();
		cbr.run();
		cbr.changeGear();
		
	}

}
