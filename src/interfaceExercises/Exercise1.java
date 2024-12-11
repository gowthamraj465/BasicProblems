package interfaceExercises;
interface FirstInterface{
	void myMethod();
	static int square(int x) {
		return x*x;
	}
}

class DemoClass implements FirstInterface{
	public void myMethod() {
		System.out.println("this method belongs to the first interface");
	}

}

public class Exercise1 {
	public static void main(String[] args) {
		System.out.println(FirstInterface.square(4));
		DemoClass obj = new DemoClass();
			obj.myMethod();
			
			
		
	}

}
