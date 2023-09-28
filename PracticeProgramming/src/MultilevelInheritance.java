class Animal1{
	void printAnimal() {
		System.out.println("Animal is running");
	}
}
class Dog1 extends Animal1{
	void printDog() {
		System.out.println("The dog is running");
	}
}
class Labradors extends Dog1{
	void printLabradors() {
		System.out.println("LAbradors is running");
	}
	
}	
public class MultilevelInheritance {
	public static void main(String[] args) {
		
	
	Labradors lb=new Labradors();
	lb.printLabradors();
	lb.printDog();
	lb.printAnimal();
	}
}


