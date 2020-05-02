package 实例016;

import java.util.Scanner;

public class 三元运算符 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		String check = (number % 2 == 0) ? "偶数" : "奇数";
		System.out.println(check);
		scan.close();
	}

}
