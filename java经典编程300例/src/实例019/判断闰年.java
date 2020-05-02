package 实例019;

import java.util.Scanner;

public class 判断闰年 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long year;
		try {
			year = scan.nextLong();
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.print(year + "年是闰年！");
			} else {
				System.out.print(year + "年不是闰年！");
			}
		} catch (Exception e) {
			System.err.print("输入错误！");
		}
		scan.close();
	}
}
