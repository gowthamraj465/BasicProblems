package inheritance;
class A {
	public void display() {
		System.out.println("A");
	}
}
class B extends A{
	public void show() {
		System.out.println("B");
	}
}
class C extends B{
	public void view () {
		System.out.println("C");
	}
	
}


public class MultiLevelInheritence  {
	public static void main(String[] args) {
		C obj = new C();
		obj.display();
		obj.show();
		obj.view();
	}
	
	

}
