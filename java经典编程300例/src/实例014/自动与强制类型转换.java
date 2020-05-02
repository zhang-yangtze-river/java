package 实例014;

public class 自动与强制类型转换 {
	public static void main(String[] args) {
		byte b = 127;
		char c = 'W';
		short s = 23561;
		int i = 3333;
		long l = 400000L;
		float f = 3.14159F;
		double d = 54.523;
		System.out.println("b=" + b);
		System.out.println("b+c=" + (b + c));
		System.out.println("b+c+s=" + (b + c + s));
		System.out.println("b+c+s+i=" + (b + c + s + i));
		System.out.println("b+c+s+i+l=" + (b + c + s + i + l));
		System.out.println("b+c+s+i+l+f=" + (b + c + s + i + l + f));
		System.out.println("b+c+s+i+l+f+d=" + (b + c + s + i + l + f + d));
		System.out.println("lont to int=" + (int) l);
		System.out.println("lont to short=" + (short) l);
		System.out.println("double to int=" + (int) d);
		System.out.println("short to char=" + (char) s);
	}
}
