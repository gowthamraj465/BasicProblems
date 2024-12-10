package inheritance;
class Animal{

	public void makeSound() {
		System.out.println("The Animal makes specific sound");
	}
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("The Dog Barks");
	}
}

public class Test {
	public static void main(String[] args) {
		
	Animal species = new Animal ();
	species.makeSound();
	
	Dog dog = new Dog();
	dog.makeSound();
	}
}
