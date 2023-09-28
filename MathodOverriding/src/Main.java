//just like single inheritance
class Vehicle{
	public void run() {
		System.out.println("vehicle is running");
	}
}
class Bike extends Vehicle{
	public void run() {
		System.out.println("bike is running");
	}
}
public class Main {
	public static void main(String[] args) {
	Bike b=new Bike();
	b.run();
	Vehicle v=new Vehicle();
	v.run();
	}
}

 