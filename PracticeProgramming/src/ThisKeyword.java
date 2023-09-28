
public class ThisKeyword {
	String n;
	ThisKeyword (String n){
		this.n=n;
	}
	void display() {
		System.out.println("THis keyword :" + n);
	}
	
	public static void main (String[] args) {
		ThisKeyword tk=new ThisKeyword("Hello");
		tk.display();
	}
	

}
