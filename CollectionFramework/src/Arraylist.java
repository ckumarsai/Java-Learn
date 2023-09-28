import java.util.*;
public class Arraylist {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("sai");
		al.add("ashok");
		al.add(30);
		al.add(2.6);
		al.add(31.98f);
		al.add('a');
//		System.out.println(al);
		al.remove(1);
//		System.out.println(al);
		Iterator i = al.iterator();
	      System.out.println("The ArrayList elements are:");
	      while (i.hasNext()) {
	         System.out.println(i.next());
		
		
	}
	}
}
