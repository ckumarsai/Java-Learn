class Device{
	String n="Lg";
	void display() {
		System.out.println(n);
	}
}
class Mobile extends Device{
	String n="Sony";
	void display() {
		System.out.println(super.n);// it is used to call the super class variable
		System.out.println(n);
//		super.display();it is used to call super/parent class methods
	}
}
public class Super {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.display();
		
	}

}
