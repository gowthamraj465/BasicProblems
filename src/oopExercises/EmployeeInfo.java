package oopExercises;

public class EmployeeInfo {
	int salary = 20000;
}
class Engineer extends EmployeeInfo {
	int benefits = 10000;
}
class Main{
	public static void main(String[] args) {
	Engineer E1 = new Engineer();
	System.out.println("Salary"+E1.salary +"/n benefits"+E1.benefits);
}
}
