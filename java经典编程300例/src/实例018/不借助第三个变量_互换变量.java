package ʵ��018;

import java.util.Scanner;

public class ����������������_�������� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		scan.close();
		A = A ^ B;
		B = A ^ B;
		A = A ^ B;
		System.out.println("A=" + A + "\tB=" + B);

	}

}
