
public class College {
	int a;
	String b;
	// default constructor/no-arg constr can be created by using cass name
//	College()
//	{
//		
//	}
//	
//	College (int c, String d){
//		a=c;
//		b=d;
//	}
	
	//parameterized or argument Constr
	College(int c, String d){
		a=c;
		b=d;
	}
	public static void main(String[] args) {
		College cs=new College(40, "n");
		College cs1=new College(60, "hello");
		System.out.println(cs.a+cs.b);
		System.out.println(cs1.a+cs1.b);
		
	}

}
