package 作业;

 public class gb2312 {
	 public static void main(String[] args) throws Exception {
		 String hanzi="内";
		 int a,b;
		 byte[] gb=hanzi.getBytes("gb2312");
		 a=gb[0]&0xff;
		 b=gb[1]&0xff;
		 System.out.println("‘内’的区码为"+Integer.toHexString(a)+"\n"+"‘内’的位码为"+Integer.toHexString(b));
	 }
}
