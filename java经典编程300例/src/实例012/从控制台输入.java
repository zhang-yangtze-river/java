package 实例012;

import java.util.Scanner;

public class 从控制台输入 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println(line.length());
		scanner.close();
	}
}
