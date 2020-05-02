package 实例029;

public class break终止循环 {
	public static void main(String[] args) {
		System.out.println("中断单层循环");
		String[] array=new String[] {"1","2","3","4",
				"5","6","7","8","9"};
		for(String string:array) {
			if(string.equals("5"))
				break;
			System.out.print("有"+string+"\t");
		}
		System.out.println("\n中断双层循环");
		int[][] myScoes=new int[][] {{67,89,67,33,89},{123,45}};
		No1:for(int[] is:myScoes) {
			for(int i:is) {
				System.out.print(i+"\t");
				if(i<60) {
					System.out.println("\n怎么没有及格？");
					break No1;
				}
			}
		}
	}
}
