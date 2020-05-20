package chapter4;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int capacity) {
		max = capacity;
		num = front = rear = 0;
		try {
			que = new int [max];
		}catch(OutOfMemoryError e) {
		max=0;
		}
	}
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=max) throw new OverflowIntQueueException();
		que[rear++] =x;
		num++;
		if(rear==max) rear =0;
		return x;	
	}
	
	public int deque() throws EmptyIntQueueException{
		if(num<= 0) throw new EmptyIntQueueException();
		int x= que[front++];
		num--;
		if(front==max) front = 0;
		return x;
	}
	
	public int peek() throws EmptyIntQueueException{
		if(num<= 0) throw new EmptyIntQueueException();
		int x= que[front++];
		return x;
	}
	
	public int indexOf(int key) {
		for(int i=0; i<num; i++) {
			int idx = (i+front) % max;
			if(que[idx]==key) return idx;
		}
		return -1;
	}
	
	public void clear() {
		num=front= rear = 0;
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
	if(num<=0) System.out.println("ť�� ��� �ֽ��ϴ�.");
	else {
		for(int i = 0 ; i<num; i++)
			System.out.print(que[(i+front)%max]+"  ");
			System.out.println();
	}
	}
	
	public int search(int key) {
		for(int i = 0; i<num; i++) {
			int idx = (i+front) % max;
			if(que[idx]==key) return (idx-front)%max+1;
			                  //return i+1;
		}
		return 0;
	}
	
	
	
	
}


