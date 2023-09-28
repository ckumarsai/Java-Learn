
public class Overloading {
	static int addition(int a, int b) {
		return a+b;
	}
	static int addition(int a, int b, int c) {
		return a+b+c;
	}
	static double addition(double a, double b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(addition(16.3,19.2,13));
		System.out.println(addition(18,29,3));
		System.out.println(addition(2,3));
	}

}
