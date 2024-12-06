package oopExercises;

public class StudentInfo {
	String name,course;
	int rollNo;
	float fee;
	StudentInfo(String name,String course,int rollNo){
		this.name=name;
		this.course=course;
		this.rollNo=rollNo;		
	}
	StudentInfo(String name,String course,int rollNo,float fee){
		this(name,course,rollNo);
		this.fee=fee;
		
	}
	void display() {
		System.out.println(name+" "+course+" "+rollNo+" "+fee);
	}


public static void main(String[] args) {
	StudentInfo student1 = new StudentInfo("Gowtham","java",1234);
	StudentInfo student2 = new StudentInfo("Barani","java",6789,20000f);
	student1.display();
	student2.display();
	
	
}
}