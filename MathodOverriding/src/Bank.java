
class Banking{
	public  int getRateOfInterest() {
		return 0;
	}
	
}
class Sbi extends Banking{
	public int getRateOfInterest() {
		return 1;
	}
}
class Icici extends Banking {
	public int getRateOfInterest() {
		return 2;
	}
}
class Axis extends Banking{
	public int getRateOfInterest() {
		return 3;
	}
}
public class Bank {
	public static void main(String[] args) {
		Sbi s=new Sbi();
		Icici i=new Icici();
		Axis a=new Axis();
		System.out.println("sbi rate of interest:" +s.getRateOfInterest());
		System.out.println("icici rate of interest:" +i.getRateOfInterest());
		System.out.println("axis rate of interest:" +a.getRateOfInterest());
	}
}
