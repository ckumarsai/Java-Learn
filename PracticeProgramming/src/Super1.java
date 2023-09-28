class Devices{
	Devices(){
		System.out.println("This Device");
	}
}
class Television extends Devices{
	Television(){
		super();
		System.out.println("Television");
		
	}
}
public class Super1 {
	public static void main(String[] args) {
	Television tv=new Television();
	}
}
