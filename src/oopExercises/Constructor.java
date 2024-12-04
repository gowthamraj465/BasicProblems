package oopExercises;

public class Constructor {
	String studentName;
	int studentID;
	char grade;
	 /*void assign(String name,int id,char gr) {
		 studentName = name;
		 studentID =id;
		 grade = gr;
		 }*/
	Constructor(String name,int id,char gr){
		studentName = name;
		 studentID =id;
		 grade = gr;
	}
	 
	 
	 
	void display() {
		System.out.println("NAME : "+studentName);
		System.out.println("ID: "+studentID);
		System.out.println("GRADE : "+grade);
	}
	public static void main(String[] args) {
		Constructor studentInfo = new Constructor("Gowtham",123456,'a');
		/*studentInfo.studentName = "Gowtham";
		studentInfo.studentID = 123456;
		studentInfo.grade = 'A';
		studentInfo.display();*/
		
		
		studentInfo.display();
		Constructor student1Info = new Constructor("Barani",164682,'a');
		student1Info.display();
	}

}
