 
public class Overloading 
{
	public  int  ashok(int i,int j) {
//		System.out.println(i+j);
		return i+j;
	}
//	public static  int ashok(int i,int j) { //it is not possible in overloading
//		System.out.println("hello ashok");
//		return i+j;
//	} 
	public  double ashok(double a,double b,double c,double d) {
//		System.out.println(a+b+c+d);
		return a+b+c+d;
	}
	
	
	public  double ashok(double a,double b,double c) {
//		System.out.println(a+b+c);
		return a+b+c;
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
	   System.out.println(o.ashok(10,20));
       System.out.println(o.ashok(20,40,60));
	   System.out.println(o.ashok(20,40,80,90));
		
	}

}
