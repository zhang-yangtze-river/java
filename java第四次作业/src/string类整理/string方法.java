package string类整理;

public class string方法 {
public static void main(String[] args) {
	String s1="12340000";
//	length:返回该字符串的长度，长度等于字符串中的unicode单位数。
	System.out.println("length is:"+s1.length());
//	charAt:此字符串指定索引处的char值。第一个字符值位于索引0处。
	System.out.println("第0个字符为:"+s1.charAt(0));	
	char[] chars=new char[10];
	for(int i=0;i<10;i++) {
		chars[i]='a';
	}
/*getChars主要功能为提取字符串的一个指定长度的子串，然后存入到字符数组中。
 * public void getChars(int srcBegin, int srcEnd, char[] dst,  int dstBegin)
 * srcBegin -- 字符串中要复制的第一个字符的索引。
 * srcEnd -- 字符串中要复制的最后一个字符之后的索引。
 * dst -- 目标数组。
 * dstBegin -- 目标数组中的起始位置。
 */
	s1.getChars(0, 2, chars, 3);
	System.out.println(chars);
//	replace() 方法通过用 newChar 字符替换字符串中出现的所有 oldChar 字符，并返回替换后的新字符串,原来的字符串不变。
//	public String replace(char oldChar, char newChar)
	System.out.println(s1.replace('0','a'));	
	s1=s1.replace('0','a');
//	toUpperCase() 方法将字符串小写字符转换为大写,并返回一个新字符串,原来的字符串不变。
//	public String toUpperCase()
	System.out.println(s1.toUpperCase());
	s1=s1.toUpperCase();
//	与上面的方法类似，这个方法只不过是把大写变成小写。
	System.out.println(s1.toLowerCase());
	
	String s2="   zcj";
//	trim() 方法用于删除字符串的头尾空白符,并返回一个新字符串,原来的字符串不变。
	System.out.println(s2+"\n"+s2.trim()+"\n"+s2);
//	toCharArray() 方法将字符串转换为字符数组。
	char[] chars1;
	chars1=s2.toCharArray();
	System.out.println(chars1);
}
}
