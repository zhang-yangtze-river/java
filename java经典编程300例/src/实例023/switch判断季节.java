package ÊµÀı023;

import java.util.Scanner;

public class switchÅĞ¶Ï¼¾½Ú {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mouth = scan.nextInt();
		scan.close();
		switch (mouth) {
		case 12:
		case 1:
		case 2:
			System.out.println("¶¬¼¾");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("´º¼¾");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("ÏÄ¼¾");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Çï¼¾");
			break;
		default:
			System.err.println("ÊäÈë´íÎó£¡");
		}
	}

}
