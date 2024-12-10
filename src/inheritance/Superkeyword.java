package inheritance;
class Student {
	void message() {
		System.out.println("Ths is a Method of Super class");
	}
}
class S1 extends Student{
	 void message() {
		 System.out.println("This is a Method of Sub Class");
	 }

 void display() {
	 super.message();
	 message();
 }
}
public class Superkeyword {
	public static void main(String[] args) {
		S1 obj = new S1();
		obj.display();
	}
}

