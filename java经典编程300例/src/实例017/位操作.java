package 实例017;

import java.util.Scanner;

public class 位操作 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		scan.close();
		System.out.println("number乘以16为" + (number << 4));

	}

}
