package chapter6;
import java.util.Scanner;

public class Chapter6_2_2 {
	public static void swap(int[] x, int idx1, int idx2) {
		 
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
		
	}
	public static void bubbleSort(int[] x, int num) {
		int compareNum=0;
		int swapNum = 0;
		for(int i = 0; i<num-1; i++) {
			System.out.println("패스"+(i+1));
			for(int j = num-1; j>i; j--) {
				
				for (int m = 0; m < num - 1; m++)
					System.out.printf("%3d %c", x[m], (m != j - 1) ? ' ' : (x[j - 1] > x[j]) ? '+' : '-');
				System.out.printf("%3d\n", x[num - 1]);
				compareNum++;
				if(x[j-1]>x[j]) {
					swap(x, j-1, j);
					swapNum++;
				}		
			}
			for (int m = 0; m < num; m++)
				System.out.printf("%3d  ", x[m]);
			System.out.println();
			
		}
		System.out.println("비교를 "+ compareNum +"회 했습니다.");
		System.out.println("교환을 "+ swapNum +"회 했습니다.");
	}
	public static void main(String[] args) {
		// 버블 정렬하는 프로그램을 자세히 출력하시오
		// 두 요소 사이에 교환을 수행하면 "+"를, 교환을 수행하지 않으면 "-"을 출력하시오
		// 비교 횟수와 교환 횟수를 출력하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.println("버블정렬 - 버전1");
		System.out.print("요소수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		bubbleSort(x, num);
		
		System.out.println("오름차순으로 정리합니다.");
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
		}
		
		
	}
}
