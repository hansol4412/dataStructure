package chapter6;
import java.util.Scanner;
public class Chapter6_6_11 {
	public static void swap(int[] x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
	static void quickSort(int[] a, int left, int right) {
		
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);
		lstack.push(left);
		rstack.push(right);
		System.out.printf("a[%d]~a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", left, right);
		
		while(lstack.isEmpty() != true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left+right)/2];
			System.out.printf("스택에서 분할하는 문제를 꺼냈습니다.a[%d]~a[%d]를 분할합니다.\n", left, right);
			do {
				while (a[pl]<x) pl++;
				while (a[pr] > x) pr--;
				if(pl<=pr) {
					System.out.println(a[pl]+"과 " +a[pr]+"을 교환합니다.");
					swap(a, pl++, pr--);	
					
				}
			}while(pl<= pr);
			
			if(left <pr) {
				lstack.push(left);
				rstack.push(pr);
				System.out.printf("a[%d]~a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", left, pr);

			}
			if(right > pl) {
				lstack.push(pl);
				rstack.push(right);
				System.out.printf("a[%d]~a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", pl, right);

			}
		}
		
	
	}
	
	public static void main(String[] args) {
			// 비재귀적인 퀵정렬을 스택을 사용해 메소드를 작성하여라
			// 푸시, 팝 분할 과정을 출력하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.println("퀵정렬");
		System.out.print("요소수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; 
		
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		quickSort(x,0,num-1); 
		
		System.out.println("오름차순으로 정리합니다.");
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
		}
			
	}
}
	