
public class VariableExample {
	int a=10;
	int b=20;
	static int c=40;
	static int d=80;
	public void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(VariableExample.d);
	}
	public static  void method2() {
		VariableExample t=new VariableExample();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(VariableExample.c);
		System.out.println(t.d);
		System.out.println(VariableExample.d);
	}
//	public class Variables {
//		public void hi() {
//			System.out.println(a);
//			System.out.println(c);
//			System.out.println(d);
//		}
//	}
	public static void main(String[] args) {
		VariableExample ve=new VariableExample();
		ve.m1();
		method2();
		ve.b=100; ve.c=200;
		System.out.println(ve.b);
		System.out.println(ve.c);
		VariableExample ve1=new VariableExample();
		System.out.println(ve1.b);
		
		
		
//		VariableExample.Variables tk = ve.new Variables();
//		tk.hi();
		
	}
}
