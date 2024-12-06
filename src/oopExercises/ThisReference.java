package oopExercises;

public class ThisReference {
	void m() {
		System.out.println("Hello M");
	}
	void n() {
		this.m();
		System.out.println("Hello N");
	}
	public static void main(String[] args) {
		ThisReference g = new ThisReference();
		g.n();
	}

}
