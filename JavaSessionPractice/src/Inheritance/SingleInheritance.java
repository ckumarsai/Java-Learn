package Inheritance;
class Animal{
	void parentAnimal() {
		System.out.println("animal mathod");
	}
}
class Dog extends Animal {
	void printDog() {
		System.out.println("dog is running");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Dog d=new Dog(); //child obj
		d.parentAnimal();
		d.printDog();
		Animal a=new Dog();
		a.parentAnimal();// parent class obj
//		a.printDog();  it is child method it is not ptinted it shows error
	}
	

}
