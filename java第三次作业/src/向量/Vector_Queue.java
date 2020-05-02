package ����;

import java.util.Vector;

public class Vector_Queue {
	public Vector<Object> Queue = new Vector();
	public int size;

	public Vector_Queue(int i) {
		this.size = i;
		Vector<Object> Queue = new Vector<Object>(this.size);
	}

	public void push(int j) {
		Queue.addElement(j);
	}

	public int pop() {
		int j = (int) Queue.firstElement();
		Queue.remove(0);
		return j;
	}

	public String full() {
		if (Queue.size() == this.size)
			return "����������ˡ�";
		else
			return "����ӻ�û������";
	}

	public String empty() {
		if (Queue.isEmpty())
			return "������п��ˡ�";
		else
			return "������л�û�пա�";
	}
}
