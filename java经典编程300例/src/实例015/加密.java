package ÊµÀý015;

import java.util.Scanner;

public class ¼ÓÃÜ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		scan.close();
		char[] array = password.toCharArray();
		for (int i = 0; i < array.length; i++) {
			array[i] = (char) (array[i] ^ 12345);
		}
		System.err.println(new String(array));
	}

}
