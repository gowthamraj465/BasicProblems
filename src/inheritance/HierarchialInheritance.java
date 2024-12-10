package inheritance;
class X{
	public void printX() {
		System.out.println("Class X");
	}
}
class Y extends X{
	public void printY() {
	System.out.println("Class Y");
	}
}
class Z extends X{
	public void printZ () {
		System.out.println("Class Z");
	}
	
}

public class HierarchialInheritance {
	public static void main(String[] args) {
		Y obj = new Y();
		obj.printX();
		obj.printY();
		Z obj1 = new Z();
		obj1.printX();
		obj1.printZ();
		
	}

}
