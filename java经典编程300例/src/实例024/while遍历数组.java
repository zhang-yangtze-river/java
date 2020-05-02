package 实例024;

public class while遍历数组 {

	public static void main(String[] args) {
		String[] aves = new String[] { "白鹭", "黄鹂", "鹦鹉" };
		int index = 0;
		while (index < aves.length) {
			System.out.println(aves[index++]);
		}
	}
}
