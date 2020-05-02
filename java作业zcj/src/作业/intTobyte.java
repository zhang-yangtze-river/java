package 作业;

public class intTobyte {
	public static void main(String[] args) {
		int num=-2;
		byte[] btmsb=new byte[4];
		btmsb[0]=(byte)((num>>24)&0xff);
		btmsb[1]=(byte)((num>>16)&0xff);
		btmsb[2]=(byte)((num>>8)&0xff);
		btmsb[3]=(byte)((num)&0xff);
		System.out.println("大端byte数组："+btmsb[0]+"	"+btmsb[1]+"	"+btmsb[2]+"	"+btmsb[3]+"\n");
		byte[] btlsb=new byte[4];
		btlsb[3]=(byte)((num>>24)&0xff);
		btlsb[2]=(byte)((num>>16)&0xff);
		btlsb[1]=(byte)((num>>8)&0xff);
		btlsb[0]=(byte)((num)&0xff);
		System.out.println("小端byte数组："+btlsb[0]+"	"+btlsb[1]+"	"+btlsb[2]+"	"+btlsb[3]);
	}

}