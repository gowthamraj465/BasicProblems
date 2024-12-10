package abstractclasses;
abstract class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public abstract void makeSound();
	public String getName() {
		return name;
	}	
}
class Dog extends Animal{
	public Dog(String name) {
		super(name);		
	}
	public void makeSound() {
		System.out.println(getName()+" Barks");
	}	
}
class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	public void makeSound() {
		System.out.println(getName()+ "  Meows");
	}
	
}
public class AnimalBehaviours {
	public static void main(String[] args) {
		Dog myDog = new Dog("Bolt");
		Cat myCat = new Cat("Fluffy");
		myDog.makeSound();
		myCat.makeSound();
	}

}
