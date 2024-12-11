package inheritance;
 abstract class Vehicle {
	 private String make;
	 private String model;
	 private int year;
	 private String fuelType;
	 private double fuelEfficiency;
	 
	 public Vehicle(String make,String model,int year,String fuelType,double fuelEfficiency)
	 {
		 this.make=make;
		 this.model=model;
		 this.year=year;
		 this.fuelType=fuelType;
		 this.fuelEfficiency=fuelEfficiency;
		 
	 }
	 public String getMake() { return make; }
		 
	 public String getModel() { return model; }
	 
	 public int getYear() { return year; }
	 
	 public String getFuelType() { return fuelType;}
	 public double getFuelEfficiency()	{ return fuelEfficiency; }
	 
	 public abstract double calculateFuelEfficiency();
	 public abstract double calculateDistanceTraveled();
	 public abstract double getMaxSpeed();
	
}
 class Truck extends Vehicle{
	 private double cargoCapacity;
	 public Truck(String make,String model,int year,String fuelType,double fuelEfficiency,double cargoCapacity) {
	 super(make,model,year,fuelType,fuelEfficiency);
	 this.cargoCapacity = cargoCapacity;
 }
	 public double getCargoCapacity() {
		 return cargoCapacity;
	 }
	 public double calculateFuelEfficiency() {
		 return getFuelEfficiency() * (1.0/1.0+(getCargoCapacity()/1000.0));
	 }
	 public double calculateDistanceTraveled() {
		return calculateFuelEfficiency()*getFuelEfficiency();
	 }
	 public double getMaxSpeed() {
		 return 80.00;
	 }
 }
public class VehicleInfo {
	public static void main(String[] args) {

	Truck t1 = new Truck("Mahindra","Maindra SuproMaxi",2024,"DISEL",8.112,4.5);
	System.out.println("TRUCK MODEL : "+t1.getModel());
	System.out.println("FUEL EFFICIENCY : "+t1.calculateFuelEfficiency()+" per litre");
	System.out.println("DISTANCE TRAVELED : "+t1.calculateDistanceTraveled()+"KiloMeters");
	System.out.println("MAX SPEED : "+t1.getMaxSpeed()+"Km/hr");
	}
}
