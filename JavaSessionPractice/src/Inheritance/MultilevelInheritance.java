package Inheritance;
class Animal1{
	 public void showAnimal1() {
		System.out.println("animal1 is exe");
	}
}
class Dog1 extends Animal1 {
	 public void showDog() {
		System.out.println("dog is running"); 
	}
}
class Labrods extends Dog1 {
	public void showLabrods() {
		System.out.println("labrods is running");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
	Labrods l=new Labrods();
	l.showLabrods();
	l.showDog();
	l.showAnimal1();
	}
}
