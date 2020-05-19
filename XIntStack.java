package chapter4;

public class XIntStack {
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stk;
	public int sw;
	
	public class EmptyXIntStackException extends RuntimeException {
		public EmptyXIntStackException() {}
	}
	
	public class OverflowXIntStackException extends RuntimeException{
		public OverflowXIntStackException() {}
	}
	
	public XIntStack(int capacity){
		max = capacity;
		ptrA = 0;
		ptrB = max-1;
		
		try {
			stk = new int[max];
		}catch (OutOfMemoryError e) {
			max =0; //배열 본체의 생성 실패할 경우 다른 메소드가 존재하지 않는 배열에 잘못 접근하는 것을 방지
		}
	}
	
	public int push(int sw, int x) throws  OverflowXIntStackException{
		if(ptrA>=ptrB+1) throw  new OverflowXIntStackException();
		switch(sw) {
		case 10:
			stk[ptrA++]=x;
			break;
			
		case 20:
			stk[ptrB--]=x;
			break;
		}
		return x;	
	}
	
	public int pop(int sw) throws EmptyXIntStackException {
		int x=0;
		switch(sw) {
		case 10:
			if(ptrA<=0) throw new EmptyXIntStackException();
			x=stk[--ptrA];
			break;
		case 20:
			if(ptrB>=max-1) throw new EmptyXIntStackException();
			x=stk[++ptrB];
			break;
		}
		return x;
	}
	
	public int peek(int sw) throws EmptyXIntStackException {
		int x=0;
		switch(sw) {
		case 10:
			if(ptrA<=0) throw new EmptyXIntStackException();
			x=stk[ptrA-1];
			break;
		case 20:
			if(ptrB>=max-1) throw new EmptyXIntStackException();
			x=stk[ptrB+1];
			break;
		}
		return x;
	}
	
	public int indexOf(int sw,int x) {
		
		switch(sw) {
		case 10:
			for(int i=ptrA-1; i>=0; i--) {
				if(stk[i]==x) return i;
			}
			break;
			
		case 20:
			for(int i=ptrB+1; i<=max; i++) {
				if(stk[i]==x) return i;
			}
			break;
			}
		return -1;
	}
	
	public void clear(int sw) {
		switch(sw) {
		case 10:
		ptrA = 0;
		break;
		case 20:
			ptrB = max-1;
			break;
		}
	}
	
	public int capacity() {
		return max;
	}
	
	public int size(int sw) {
		switch(sw) {
		case 10:
		return ptrA;
		case 20:
			return max-ptrB-1;
		}
		return 0;
	}
	
	public boolean isEmpty(int sw) {
		switch(sw) {
		case 10:
		return ptrA<=0;
		case 20:
			return ptrB>=max-1;
		}
		return true;
	}
	
	public boolean isFull() {
		return ptrA >= ptrB+1;
	}
	
	public void dump(int sw) {
		
		switch(sw) {
		case 10:
			if(ptrA<=0) System.out.println("스택이 비어있습니다.");
			else {
				for(int i = 0; i< ptrA; i++) 
					System.out.print(stk[i]+" ");
					System.out.println();
				}
		break;
		
		case 20:
			if(ptrB>=max-1) System.out.println("스택이 비어있습니다.");
			else {
				for(int i = max-1; i> ptrB; i--) 
					System.out.print(stk[i]+" ");
					System.out.println();
				
			break;
		}
		
	}
	}

}
