package chapter6;
import java.util.Scanner;
public class Chapter6_6_10 {
	public static void swap(int[] x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];
		System.out.print("a["+left+"]~ a["+right+"]: ");
		for(int i = left; i<= right; i++)
			System.out.print(a[i]+ " ");
		System.out.println();
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);	
		}while(pl<=pr);
		if(left<pr) quickSort(a, left, pr);
		if(pl<right) quickSort(a, pl, right);
		
		
	}
	static void quickSort(int[] a, int n) {
		quickSort(a, 0, n - 1);
	}
	public static void main(String[] args) {
		// 퀵정렬
		Scanner stdIn = new Scanner(System.in);
		System.out.println("퀵정렬");
		System.out.print("요소수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; 
		
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		quickSort(x,num); 
		
		System.out.println("오름차순으로 정리합니다.");
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
		}
			
	}
}

