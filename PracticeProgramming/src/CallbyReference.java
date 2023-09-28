
public class CallbyReference {
	int a;
	int b;
	private static void add(CallbyReference op, CallbyReference op1) {
		op.a=10;
		System.out.println("Result from method :" + (op.a+op.b));
	}
	public static void main(String[] args) {
		CallbyReference rf=new CallbyReference();
		CallbyReference rf1=new CallbyReference();
		rf.a=2; rf.b=3;
		System.out.println("before passing:" + (rf.a + rf.b));
		rf.add(rf, rf);
		System.out.println("Result from main:" + (rf.a + rf.b));
	}
	

}
