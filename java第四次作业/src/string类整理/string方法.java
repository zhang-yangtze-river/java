package string������;

public class string���� {
public static void main(String[] args) {
	String s1="12340000";
//	length:���ظ��ַ����ĳ��ȣ����ȵ����ַ����е�unicode��λ����
	System.out.println("length is:"+s1.length());
//	charAt:���ַ���ָ����������charֵ����һ���ַ�ֵλ������0����
	System.out.println("��0���ַ�Ϊ:"+s1.charAt(0));	
	char[] chars=new char[10];
	for(int i=0;i<10;i++) {
		chars[i]='a';
	}
/*getChars��Ҫ����Ϊ��ȡ�ַ�����һ��ָ�����ȵ��Ӵ���Ȼ����뵽�ַ������С�
 * public void getChars(int srcBegin, int srcEnd, char[] dst,  int dstBegin)
 * srcBegin -- �ַ�����Ҫ���Ƶĵ�һ���ַ���������
 * srcEnd -- �ַ�����Ҫ���Ƶ����һ���ַ�֮���������
 * dst -- Ŀ�����顣
 * dstBegin -- Ŀ�������е���ʼλ�á�
 */
	s1.getChars(0, 2, chars, 3);
	System.out.println(chars);
//	replace() ����ͨ���� newChar �ַ��滻�ַ����г��ֵ����� oldChar �ַ����������滻������ַ���,ԭ�����ַ������䡣
//	public String replace(char oldChar, char newChar)
	System.out.println(s1.replace('0','a'));	
	s1=s1.replace('0','a');
//	toUpperCase() �������ַ���Сд�ַ�ת��Ϊ��д,������һ�����ַ���,ԭ�����ַ������䡣
//	public String toUpperCase()
	System.out.println(s1.toUpperCase());
	s1=s1.toUpperCase();
//	������ķ������ƣ��������ֻ�����ǰѴ�д���Сд��
	System.out.println(s1.toLowerCase());
	
	String s2="   zcj";
//	trim() ��������ɾ���ַ�����ͷβ�հ׷�,������һ�����ַ���,ԭ�����ַ������䡣
	System.out.println(s2+"\n"+s2.trim()+"\n"+s2);
//	toCharArray() �������ַ���ת��Ϊ�ַ����顣
	char[] chars1;
	chars1=s2.toCharArray();
	System.out.println(chars1);
}
}
