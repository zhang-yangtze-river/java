package ʵ��013;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class �ض������������־ {
	public static void main(String[] args) {
		try {
			PrintStream upto = System.out;
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			int age = 18;
			System.out.println("����Ϊ18�ꡣ");
			String sex = "Ů";
			System.out.println("�Ա�ΪŮ��");
			String info = "���Ǹ�" + age + "���" + sex + "���ӡ�";
			System.out.println("���Ͻ��Ϊ��" + info);
			System.setOut(upto);
			System.out.println("������ɣ��鿴��־�ļ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
