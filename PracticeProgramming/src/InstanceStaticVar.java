
public class InstanceStaticVar {
	int a=20;   //instance variable
	static int b=40; // static variable
//	void printValue() {
//		System.out.println("The value is" + a);
//		System.out.println("The value is" + b);
//	}
	public static void main(String[] args) {
		InstanceStaticVar obj = new InstanceStaticVar();
		InstanceStaticVar obj1 = new InstanceStaticVar();
		System.out.println("the value is:"+ obj.a);
		
		System.out.println("the value is:"+ InstanceStaticVar.b);
		System.out.println("the value is:"+ obj.b);
		System.out.println("the value is:"+ b);
		obj.a=690; obj1.b=280;
		System.out.println("--------");
		System.out.println("" +obj.a);
		System.out.println("" +obj1.a);
		System.out.println("" +obj.b);
		System.out.println("" +obj1.b);
		

	} 

}
