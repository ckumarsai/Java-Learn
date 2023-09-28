import java.util.Scanner;

public class Minmax {
	int I;
	int S;
	 static void max(int a,int b) {
		if (a>b) 
			System.out.println(+a+ "is max");
		else 
				System.out.println(+b+ "is max");
	 }
	public static void main(String[] args) {
		Minmax m1=new Minmax();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  2 numbers");
		int c=sc.nextInt();
		int d=sc.nextInt();
		max(c,d);
	}

}
