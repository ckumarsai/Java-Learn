
public class CallbyValue {
	int a;
	int b;
	private static void add(int s, int t) {
		s=30;
		System.out.println("the val is" + (s+t));
	}
	public static void main(String[] args) {
		CallbyValue cv=new CallbyValue();
         cv.a=10;
         cv.b=20;
         System.out.println("before passing:" +(cv.a + cv.b));
         add(cv.a,cv.b);
         System.out.println("after passing:" +(cv.a + cv.b));
	}
}
