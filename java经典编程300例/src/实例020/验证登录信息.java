package ʵ��020;

import java.util.Scanner;

public class ��֤��¼��Ϣ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String usename = scan.nextLine();
		if (!usename.equals("mr")) {
			System.err.println("�Ƿ��û�����");
		} else {
			String password = scan.nextLine();
			if (!password.equals("mrsoft")) {
				System.err.println("�������");
			} else {
				System.out.println("��ϲ������½�ɹ���");
			}
		}
		scan.close();
	}
}
