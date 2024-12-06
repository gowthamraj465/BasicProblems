package oopExercises;

public class StaticKeyword {
	String studentName;
	 int rollNo;
    String clgName;
	static int counter = 0;

	public StaticKeyword(String name,String clgName) {
		this.clgName=clgName;
		this.studentName=name;
		this.rollNo=setRollNo();
	}
	
	
	static int setRollNo() {
		counter++;
		return counter;
	}
	void getStudentInfo() {
		System.out.println("Student Name : "+studentName);
		System.out.println("Student RollNo. : "+rollNo);
		System.out.println("College Name : "+clgName);
	}
	 
	public static void main(String[] args) {
		
		StaticKeyword s1 = new StaticKeyword("Gowtham","ABC");
		StaticKeyword s2 = new StaticKeyword("Barani","ABC");
		s1.getStudentInfo();
		s2.getStudentInfo();
		
		
	}
	
	

}
