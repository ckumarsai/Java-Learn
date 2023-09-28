
public class Overloading1 {
	public void saikumar(int a, int b) {
		System.out.println(a+b);
	}
	public void saikumar(double i,double j) {
		System.out.println(i+j);
	}
	public void saikuamr(String k, String l) {
		System.out.println(k+l);
	}
	public static void main(String[] args) {
		Overloading1 ol=new Overloading1();
		ol.saikumar(10, 40);
		ol.saikumar(10.0, 30.0);
		ol.saikuamr("sai", "ashok");
	}

}
