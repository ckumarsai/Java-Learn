class Animals{
	static void run1() {
		System.out.println("Hiding-animal is run");
	}
	void run2() {
		System.out.println("Overriding-animals is run");
	}
}
class Cheetah extends Animals{
	static void run1() {
		System.out.println("Hiding-cheetah running fastly");
	}
	void run2() {
		System.out.println("Overriding- is cheetah runs fastly");
	}
}
public class MethodhidingOverriding {
	public static void main(String[] args) {
		
//	Animals al=new Animals();
//	Cheetah c=new Cheetah();
    Animals a=new Cheetah();
	a.run1();//hiding
	a.run2();//overring
	
}

}
