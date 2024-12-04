package basicProblems;

public class EmployeeInfo {
	String fName;
	String lName;
    int age;
    public void display() {
    System.out.println("NAME : "+fName+" "+lName);
    System.out.println("AGE : "+age);
    }
	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		emp.fName = "Gowtham";
		emp.lName = "Raj";
		emp.age = 24;
		emp.display();
		EmployeeInfo emp2 = new EmployeeInfo();
		emp2.fName = "Barani";
		emp2.lName = "Dharan";
		emp2.age = 20;
		emp2.display();
	}
}
   
