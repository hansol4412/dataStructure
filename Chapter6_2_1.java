package chapter6;
import java.util.Scanner;

public class Chapter6_2_1 {
	public static void swap(int[] x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
	public static void bubbleSort(int[] x, int num) {
		for(int i = num-1; i>0; i--) { //뒤 부터 고정
			for(int j = 0; j<i; j++) { // 앞에서 부터 비교하여, 고정되기 전까지 비교
				if(x[j]>x[j+1]) swap(x, j, j+1);
			}
		}
	}
	public static void main(String[] args) {
		//버블정렬을 수행하시오
		//교환은 처음(왼쪽)부터 수행하여, 가장 큰 값이 요소 끝으로 옮겨집니다.
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
