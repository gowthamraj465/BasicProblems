package inheritance;
class ParentClass{
	public boolean isTrue() {
		return true;
	}	
}
class ChildClass extends ParentClass{
	public boolean isTrue() {
		boolean parentResult = super.isTrue();
		return !parentResult;
	}
}

public class SuperClass {
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		boolean result = child.isTrue();
		System.out.println(result);
		ParentClass parent = new ParentClass();
		boolean result1 = parent.isTrue();
		System.out.println(result1);
	}

}
