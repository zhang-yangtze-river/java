package สýื้;

public class Main {
public static void main(String[] args) {
	int[][] s1,s2;
	s1=new int [10][10];
	s2=new int [10][10];
	for(int i=0;i<=9;i++) {
		for(int j=0;j<=9;j++) {
			s1[i][j]=i*10+j+1;
		}
	}
	int[] sleft= {0,0},sright= {9,9},dleft= {0,0},dright= {2,5};
	Arrays arrayscopy =new Arrays(sleft,sright,dleft,dright);
	arrayscopy.copy(s1,s2);
	for(int i=0;i<=9;i++) {
		for(int j=0;j<=9;j++) {
			System.out.print(s2[i][j]+" ");
		}
		System.out.print("\n");
	}
}

}
