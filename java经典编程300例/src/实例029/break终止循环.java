package ʵ��029;

public class break��ֹѭ�� {
	public static void main(String[] args) {
		System.out.println("�жϵ���ѭ��");
		String[] array=new String[] {"1","2","3","4",
				"5","6","7","8","9"};
		for(String string:array) {
			if(string.equals("5"))
				break;
			System.out.print("��"+string+"\t");
		}
		System.out.println("\n�ж�˫��ѭ��");
		int[][] myScoes=new int[][] {{67,89,67,33,89},{123,45}};
		No1:for(int[] is:myScoes) {
			for(int i:is) {
				System.out.print(i+"\t");
				if(i<60) {
					System.out.println("\n��ôû�м���");
					break No1;
				}
			}
		}
	}
}
