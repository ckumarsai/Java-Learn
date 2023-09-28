class Animal2{
	void printAnimal() {
		System.out.println("animal is running");
	}
}
class Dog2 extends Animal2{
	void printDog() {
		System.out.println("Dog is jumping");
	}
}
class Monkey extends Animal2{
	void printMonkey() {
		System.out.println("MOnkey is running");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Monkey m=new Monkey();
		Dog2 ds=new Dog2();
		m.printMonkey();
		m.printAnimal();
		ds.printDog();
		ds.printAnimal();

	}

}
