package interfaceExercises;
interface Flyable{
	void flyObj() ;
}
class Helicopter implements Flyable{
	public void flyObj() {
		System.out.println("Helicopter is flying");
	}
}
class Aeroplane implements Flyable{
	public void flyObj() {
		System.out.println("Aeroplane is flying");
	}
}

public class FlyableMain {
	public static void main(String[] args) {
		/* Flyable[] flyingObject = {new Helicopter(),new Aeroplane()};
		/*for(int i=0;i<flyingObject.length;i++) {
			flyingObject[i].flyObj();
		}*/
		for(Flyable obj:flyingObject) {
			obj.flyObj();
		}
		
	}

}
