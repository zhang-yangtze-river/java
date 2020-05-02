package 实例021;

import java.util.Scanner;

public class 用switch判断给员工分配部门 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		String language = scan.nextLine();
		switch (language.hashCode()) {
		case 3254818:
		case 2301506:
		case 2269730:
			System.out.println("员工" + name + ",java");
			break;
		case 3104:
		case 2112:
			System.out.println("员工" + name + ",c#");
			break;
		default:
			System.out.println("公司不需要" + language + "语言的程序员！");
		}
		scan.close();

	}

}
