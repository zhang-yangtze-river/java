package œÚ¡ø;

public class Main {
public static void main(String[] args) {
	Vector_Queue MyQueue=new Vector_Queue(10);
	for(int i=0;i<10;i++) {
		MyQueue.push(i);
	}
	System.out.println(MyQueue.full()+MyQueue.empty());
	for(int i=0;i<10;i++) {
		System.out.print(MyQueue.pop()+" ");
	}
	System.out.print("\n");
	System.out.println(MyQueue.full()+MyQueue.empty());
}
}
