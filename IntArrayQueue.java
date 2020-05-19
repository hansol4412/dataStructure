package chapter4;

import chapter4.IntStack.EmptyIntStackException;
import chapter4.IntStack.OverflowIntStackException;

public class IntArrayQueue {
	private int max;
	private int num;
	private int[] que;
	
	public class EmptyIntArrayQueuekException extends RuntimeException {
		public EmptyIntArrayQueuekException() {}
	}
	
	public class OverflowIntArrayQueueException extends RuntimeException{
		public OverflowIntArrayQueueException() {}
	}
	
	public IntArrayQueue(int capacity){
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch (OutOfMemoryError e) {
			max =0; //�迭 ��ü�� ���� ������ ��� �ٸ� �޼ҵ尡 �������� �ʴ� �迭�� �߸� �����ϴ� ���� ����
		}
	}
	
	public int enqueue(int x) throws  OverflowIntArrayQueueException{
		if(num>=max) 
				throw  new OverflowIntArrayQueueException();
		return que[num++] = x;
	}
	
	public int dequeue() throws EmptyIntArrayQueuekException {
		if(num<=0) throw new EmptyIntArrayQueuekException();
			int x= que[0];
		for(int i = num; i<=1; i--) { 
			que[i-1] = que[i]; 
			}
		num--;
		return x;
	}
	
	public int peek() throws EmptyIntArrayQueuekException {
		if(num<=0) throw new EmptyIntArrayQueuekException();
		return que[num];
	}
	
	public int indexOf(int x) {
		for(int i = 0; i<=num; i++)
			if(que[i]==x)
				return i;
		return -1;
	}
	
	public void clear() {
		num = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num<=0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num<=0) System.out.println("ť�� ����ֽ��ϴ�.");
		else {
			for(int i = 0; i<num; i++) {
				System.out.print(que[i]+"");
				System.out.println();
			}
		}
	}
	
	
	
	


}
