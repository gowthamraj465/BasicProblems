package inheritance;
class HRManager{
	public int salary;
	public HRManager(int salary) {
		this.salary=salary;
	}
	public void work() {
		System.out.println("Managing all Employees");
	}
	public void addEmployee() {
		System.out.println("Adiing New Employee");
	}
	public int getSalary() {
		return salary;
	}
}
class Employee extends HRManager{
	public Employee(int salary) {
		super(salary);
	}
	public void work() {
		System.out.println("Working as an Employee");
	}
}
public class EmployeeInfo {
	public static void main(String[] args) {
		Employee emp = new Employee(40000);
		int amount = emp.getSalary();
		System.out.println("Salary of Employee : "+amount+"\n");
		emp.work();
		HRManager mgr = new HRManager(75000);
		mgr.work();
		mgr.addEmployee();
		int val = mgr.getSalary();
		System.out.println("Salary of HR : "+val);
		
		
	}

}
