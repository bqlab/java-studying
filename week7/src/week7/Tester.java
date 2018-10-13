package week7;

public class Tester {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Animal animal;
		
		animal = dog;
		System.out.println(dog.sound());
		
		animal = cat;
		System.out.println(animal.sound());
	}
}