package ��ҵ;

 public class gb2312 {
	 public static void main(String[] args) throws Exception {
		 String hanzi="��";
		 int a,b;
		 byte[] gb=hanzi.getBytes("gb2312");
		 a=gb[0]&0xff;
		 b=gb[1]&0xff;
		 System.out.println("���ڡ�������Ϊ"+Integer.toHexString(a)+"\n"+"���ڡ���λ��Ϊ"+Integer.toHexString(b));
	 }
}
