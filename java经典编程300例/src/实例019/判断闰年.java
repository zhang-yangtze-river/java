package ʵ��019;

import java.util.Scanner;

public class �ж����� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long year;
		try {
			year = scan.nextLong();
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.print(year + "�������꣡");
			} else {
				System.out.print(year + "�겻�����꣡");
			}
		} catch (Exception e) {
			System.err.print("�������");
		}
		scan.close();
	}
}
