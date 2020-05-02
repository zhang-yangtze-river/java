package ื๗าต;

public class trycatch {
	public static void main(String[] args) {
		float s;
	try {
		s=1/50;
		System.out.println(s);
	} catch (Exception e) {
		s=1;
		System.out.println(s);
	}
	finally {
		s=2;
		System.out.println(s);
	}
	}
}
