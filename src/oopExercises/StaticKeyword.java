package oopExercises;

public class StaticKeyword {
	String studentName;
	int rollNo;
	static String clgName;
	static int counter = 0;
	public StaticKeyword(String name) {
		this.studentName=name;
		this.rollNo=setRollNo();
	}
	    static int setRollNo() {
		counter++;
		return counter;
	}
	static void setClgName(String clg) {
		clgName = clg;
	}
	void getStudentInfo() {
		System.out.println("Student Name : "+studentName);
		System.out.println("Student RollNo. : "+rollNo);
		System.out.println("College Name : "+clgName);
	}
	 
	public static void main(String[] args) {
		StaticKeyword.setClgName("ABC");
		StaticKeyword s1 = new StaticKeyword("Gowtham");
		StaticKeyword s2 = new StaticKeyword("Barani");
		s1.getStudentInfo();
		s2.getStudentInfo();
		
		
	}
	
	

}
