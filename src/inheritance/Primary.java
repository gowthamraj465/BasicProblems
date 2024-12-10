package inheritance;
class Person{
	public String firstName;
	public String lastName;
	public Person(String fName ,String lName) {
		this.firstName = fName;
		this.lastName =lName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
class Employ extends Person{
	private int employeeID;
	 private String jobTitle;
	public Employ (String firstName ,String lastName,int empID, String jobTitle) {
	super(firstName,lastName);
	this.employeeID = empID;
	this.jobTitle = jobTitle;	
	}
	public int getEmployeeId() {
		return employeeID;
	}
	public String getLastName() {
		return super.getLastName()+","+jobTitle;
	}
}
public class Primary {
	public static void main(String[] args) {
		Employ emp1 = new Employ("Gowtham","Raj",2464,"BackendDevoloper");
		System.out.println(emp1.getFirstName()+" "+emp1.getLastName()+"\n "+emp1.getEmployeeId());

}
}
