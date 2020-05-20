package chapter4;

import chapter4.IntQueue.EmptyIntQueueException;
import chapter4.IntQueue.OverflowIntQueueException;

public class Gqueue<E> {
	private int max;
	private int front;
	private int rear;
	private int num;
	private E[] que;
	
	public static class EmptyGqueueException extends RuntimeException{
		public EmptyGqueueException() {}
	}
	
	public static class OverflowGqueueException extends RuntimeException{
		public OverflowGqueueException() {}
	}
	
	public Gqueue(int capacity) {
		max = capacity;
		num = front = rear = 0;
		try {
			que = (E[])new Object [max];
		}catch(OutOfMemoryError e) {
		max=0;
		}
	}
	public E enque(E x) throws OverflowGqueueException{
		if(num>=max) throw new OverflowGqueueException();
		que[rear++] =x;
		num++;
		if(rear==max) rear =0;
		return x;	
	}
	
	public E deque() throws EmptyGqueueException{
		if(num<= 0) throw new EmptyGqueueException();
		E x= que[front++];
		num--;
		if(front==max) front = 0;
		return x;
	}
	
	public E peek() throws EmptyGqueueException{
		if(num<= 0) throw new EmptyGqueueException();
		E x= que[front++];
		return x;
	}
	
	public int indexOf(E key) {
		for(int i=0; i<num; i++) {
			int idx = (i+front) % max;
			if(que[idx].equals(key)) return idx;
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
	if(num<=0) System.out.println("큐가 비어 있습니다.");
	else {
		for(int i = 0 ; i<num; i++)
			System.out.print(que[(i+front)%max]+"  ");
			System.out.println();
	}
	}

	}
	
	
	


