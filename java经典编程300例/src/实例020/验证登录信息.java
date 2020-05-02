package 实例020;

import java.util.Scanner;

public class 验证登录信息 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String usename = scan.nextLine();
		if (!usename.equals("mr")) {
			System.err.println("非法用户名！");
		} else {
			String password = scan.nextLine();
			if (!password.equals("mrsoft")) {
				System.err.println("密码错误！");
			} else {
				System.out.println("恭喜您，登陆成功！");
			}
		}
		scan.close();
	}
}
