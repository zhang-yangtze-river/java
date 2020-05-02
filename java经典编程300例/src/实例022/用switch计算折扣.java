package ÊµÀı022;

public class ÓÃswitch¼ÆËãÕÛ¿Û {

	public static void main(String[] args) {
		float money = 110;
		String rebate = "no";
		if (money > 200) {
			int grate = (int) money / 200;
			switch (grate) {
			case 1:
				rebate = "95";
				break;
			case 2:
				rebate = "85";
				break;
			default:
				rebate = "75";
			}
		}
		System.out.println(rebate);

	}

}
