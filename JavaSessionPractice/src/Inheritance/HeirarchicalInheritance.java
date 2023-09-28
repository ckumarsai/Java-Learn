package Inheritance;
 
class  Vehicle {
	void printVehicle()	{
		System.out.println("vehicle is going");
	}
}
class Car extends Vehicle {
	void printCar() {
		System.out.println("car is going");
	}
}
class Bike extends Vehicle {
	void printBike() {
		System.out.println("bike has two wheels");
	}
}
	

public class HeirarchicalInheritance {
	public static void main(String[] args) {
		Car c=new Car();
		Bike b=new Bike();
		c.printCar();
		c.printVehicle();
		b.printBike();
		b.printVehicle();
	}

}
