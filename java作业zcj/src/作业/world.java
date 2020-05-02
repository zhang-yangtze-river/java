package ื๗าต;

public class world {
	public static void main(String[] args) {
		String str="hello,world!";
		String[] word=str.split(",|!");
		StringBuffer rever0=new StringBuffer(word[0]);
		StringBuffer rever1=new StringBuffer(word[1]);
		rever0.reverse();
		rever1.reverse();
		System.out.println(rever0+","+rever1+"!");
	}
}
