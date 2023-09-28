
class Animal{
	void printAnimal() {
		System.out.println("Animal is running");
	}
}
class Dog extends Animal{
	void printDog() {
		System.out.println("Dog is running");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Dog ds=new Dog();
		ds.printDog();
		ds.printAnimal();
	}

}
