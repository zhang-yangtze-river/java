package ʵ��030;

public class ѭ�������� {

	public static void main(String[] args) {
		String[] array=new String[] {"��","��","ӥ","��","ӥ"};
		for(String bird:array) {
			if(bird.equals("ӥ")) {
				System.out.print("  ����ӥ!  ");
				continue;
			}
			System.out.print(" "+bird+" ");
		}

	}

}
