package ʵ��023;

import java.util.Scanner;

public class switch�жϼ��� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mouth = scan.nextInt();
		scan.close();
		switch (mouth) {
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
		default:
			System.err.println("�������");
		}
	}

}
