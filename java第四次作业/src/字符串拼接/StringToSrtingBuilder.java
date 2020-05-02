package ×Ö·û´®Æ´½Ó;

public class StringToSrtingBuilder {
public static void main(String[] args) {
	String s1="a";
	long StartTime1=System.nanoTime();
	for(int i=0;i<=1000000;i++) {
		s1=s1+"a";
	}
	long EndTime1=System.nanoTime();
	System.out.println("TIME1:"+(EndTime1-StartTime1)+"ns");
	StringBuilder s2=new StringBuilder("a");
	long StartTime2=System.nanoTime();
	for(int i=0;i<=1000000;i++) {
		s2=s2.append("a");
	}
	long EndTime2=System.nanoTime();
	System.out.println("TIME2:"+(EndTime2-StartTime2)+"ns");
}
}
