package chapter1;

public class Chapter1_1 {

	static int max4(int a, int b, int c, int d) {
		// 네 값의 최대값을 구하는 max4 메서드를 작성하세요
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		if(d>max) max = d;
		
		return max;
	}
	
	static int min3(int a, int b, int c) {
		//세 값의 최소 값을 구하는 min3 메서드를 작성하시오
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		
		return min;
		}
	
	static int min4(int a, int b, int c, int d) {
		//세 값의 최소 값을 구하는 min4 메서드를 작성하시오
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		
		return min;
		}
	
	static int mid(int a, int b, int c) {
		// 세 값의 중간 값 구하는 mid 메서드를 작성하시오.
		if(a>b) {
			if(a<c) return a;
			if(b<=c) return c;
			else return b;
		}
		else if(a==b) {
			return b;
			
		}
		else {
			if(a>=c) return a;
			else if (b<=c) return b;
			else return c;
			
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println("2,4,6,8 의 최대값은? " + max4(2,6,8,4));
		System.out.println("1,3,5의 최소값은? "+ min3(5,3,1));
		System.out.println("2,6,12,-5의 최소값은? "+ min4(2,6,12,-5));
		
		System.out.println("mid(3,2,1) = " + mid(3, 2, 1)); // a＞b＞c
		System.out.println("mid(3,2,2) = " + mid(3, 2, 2)); // a＞b＝c
		System.out.println("mid(3,1,2) = " + mid(3, 1, 2)); // a＞c＞b
		System.out.println("mid(3,2,3) = " + mid(3, 2, 3)); // a＝c＞b
		System.out.println("mid(3,3,2) = " + mid(3, 3, 2)); // a＝b＞c
		System.out.println("mid(3,3,3) = " + mid(3, 3, 3)); // a＝b＝c
		System.out.println("mid(2,3,1) = " + mid(2, 3, 1)); // b＞a＞c
		System.out.println("mid(2,3,2) = " + mid(2, 3, 2)); // b＞a＝c
		System.out.println("mid(1,3,2) = " + mid(1, 3, 2)); // b＞c＞a
		System.out.println("mid(2,3,3) = " + mid(2, 3, 3)); // b＝c＞a
		System.out.println("mid(1,2,3) = " + mid(1, 2, 3)); // c＞b＞a
		System.out.println("mid(2,2,3) = " + mid(2 ,2 ,3)); // c>a=b
		System.out.println("mid(2,1,3) = " + mid(2, 1, 3)); // c>a>b
	}
}
