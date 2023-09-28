package Examplepractice;

public class OverloadExample {
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a,int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(OverloadExample.add(10, 20));
		System.out.println(OverloadExample.add(10, 20, 30));
	}
}
