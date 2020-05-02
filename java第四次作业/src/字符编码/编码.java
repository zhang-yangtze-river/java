package ×Ö·û±àÂë;

public class ±àÂë {
public static void main(String[] args) {
	String str="ÄãºÃ£¡";
	try {
	byte[] bytes1=str.getBytes("gb2312");
	byte[] bytes2=str.getBytes("gbk");
	byte[] bytes3=str.getBytes("utf-8");
	byte[] bytes4=str.getBytes("utf-16le");
	byte[] bytes5=str.getBytes("utf-16be");
	String s1=new String(bytes1);
	String s2=new String(bytes2);
	String s3=new String(bytes3);
	String s4=new String(bytes4);
	String s5=new String(bytes5);
	System.out.println("gb2312:"+s1);
	System.out.println("gbk:"+s2);
	System.out.println("utf-8:"+s3);
	System.out.println("utf-16le:"+s4);
	System.out.println("utf-16be:"+s5);
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}
