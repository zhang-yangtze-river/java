package ÊµÀı030;

public class Ñ­»·¹ıÂËÆ÷ {

	public static void main(String[] args) {
		String[] array=new String[] {"Äñ","Äñ","Ó¥","Äñ","Ó¥"};
		for(String bird:array) {
			if(bird.equals("Ó¥")) {
				System.out.print("  ·¢ÏÖÓ¥!  ");
				continue;
			}
			System.out.print(" "+bird+" ");
		}

	}

}
