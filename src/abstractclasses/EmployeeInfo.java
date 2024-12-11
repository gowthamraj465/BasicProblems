package abstractclasses;
abstract class Employee{
	protected String name;
	protected double baseSalary;
	public Employee(String name,double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	abstract double calculateSalary();
	abstract void displayInfo();
}
class Manager extends Employee{
	private double bonus;
	public Manager(String name , double baseSalary,double bonus) {
		super (name,baseSalary);
		this.bonus = bonus;
	}
	double calculateSalary() {
		return (baseSalary+bonus);
	}
	void displayInfo() {
		System.out.println("MANAGER NAME : "+name);
		System.out.println("SALARY : "+baseSalary);
		System.out.println("BONUS : "+bonus);
		System.out.println("TOTAL SALARY : "+calculateSalary());
	}
}
class Programmer extends Employee{
	private double overtimeHours;
	private double hourlyRate;
	public Programmer (String name , double baseSalary , double overtimeHours,double hourlyRate) {
		super(name,baseSalary);
		this.hourlyRate= hourlyRate;
		this.overtimeHours=overtimeHours;		
	}
	double calculateSalary() {
		return (baseSalary+(overtimeHours*hourlyRate));
	}
	void displayInfo() {
		System.out.println("PROGRAMMER NAME : "+name);
		System.out.println("SALARY : "+baseSalary);
		System.out.println("OVERTIMEHOURS : "+overtimeHours);
		System.out.println("HOURLY RATE : "+hourlyRate);
		System.out.println("TOTAL SALARY : "+calculateSalary());
	}
}
public class EmployeeInfo {
	public static void main(String[] args) {
		Manager emp1 = new Manager("GOWTHAM RAJ",50000.00,7500.00);
		Programmer emp2 = new Programmer("BARANI DHARAN",48000,5.00,25.00);
		emp1.displayInfo();
		emp2.displayInfo();
	}
	

}
