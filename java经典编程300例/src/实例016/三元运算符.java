package ʵ��016;

import java.util.Scanner;

public class ��Ԫ����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		String check = (number % 2 == 0) ? "ż��" : "����";
		System.out.println(check);
		scan.close();
	}

}
