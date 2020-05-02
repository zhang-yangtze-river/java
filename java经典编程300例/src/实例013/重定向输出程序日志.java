package 实例013;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class 重定向输出程序日志 {
	public static void main(String[] args) {
		try {
			PrintStream upto = System.out;
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			int age = 18;
			System.out.println("年龄为18岁。");
			String sex = "女";
			System.out.println("性别为女。");
			String info = "这是个" + age + "岁的" + sex + "孩子。";
			System.out.println("整合结果为：" + info);
			System.setOut(upto);
			System.out.println("程序完成，查看日志文件。");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
