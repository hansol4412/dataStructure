package chapter6;
import java.util.Scanner;

public class Chapter6_3_6 {
	public static void swap(int[] x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i=0; i <n-1; i++) {
			
			int min = i;
			for(int j = i+1; j<n; j++) 
				if(a[j] < a[min]) 
					min = j;
	
			for (int m = 0; m < n; m++)
				System.out.printf((m == i) ? "  * " : (m == min) ? "   + " : "     ");
			System.out.println();
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
			
			swap(a, i, min);
			
		}
		
	}

	public static void main(String[] args) {
		// 단순선택 정렬 메소드를 작성하시오
		// 자세히 단순 선택 정렬의 과정을 보여주시오.
		// 정렬하지 않은 부분의 첫번1재 요소 위에는 *를, 정렬하지 않은 부분의 가장 작은 요소 위에는 +를 출력하시오
		Scanner stdIn = new Scanner(System.in);
		System.out.println("단순선택정렬");
		System.out.print("요소수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		selectionSort(x, num);
		
		System.out.println("오름차순으로 정리합니다.");
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
	}

	}
}
