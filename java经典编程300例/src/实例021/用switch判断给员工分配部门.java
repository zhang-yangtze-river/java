package ʵ��021;

import java.util.Scanner;

public class ��switch�жϸ�Ա�����䲿�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String language = scan.nextLine();
		switch (language.hashCode()) {
		case 3254818:
		case 2301506:
		case 2269730:
			System.out.println("Ա��" + name + ",java");
			break;
		case 3104:
		case 2112:
			System.out.println("Ա��" + name + ",c#");
			break;
		default:
			System.out.println("��˾����Ҫ" + language + "���Եĳ���Ա��");
		}
		scan.close();

	}

}
