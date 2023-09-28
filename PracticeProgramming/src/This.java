/*
 * This can be used to invoke current class method implicitly
 */
public class This {
	void display() {
		this.display1();
		System.out.println("hello");
	}
	void display1() {
		System.out.println("hiii");
	}
	public static void main (String[] args) {
		This t=new This();
		t.display();
		t.display1();

	}
	

}
