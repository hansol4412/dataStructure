package chapter6;
import java.util.Scanner;

public class Chapter6_4_7 {

	static void insertionSort(int[] a, int n ) {
		for (int i = 2; i < n; i++) { //보초법
			int tmp = a[0] = a[i]; //보초법
			int j;
			for (j=i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}
	
	public static void main(String[] args) {
		// 단순 삽입 정렬을 하는 프로그램을 작성하시오
		// 배열의 첫번째 요소(a[0])부터 데이터를 저장하지 않고 a[1]부터 데이터를 저장하면 a[0]을 보초로하여 삽입을 마치는 조건을 줄일 수 있다
		Scanner stdIn = new Scanner(System.in);
		System.out.println("단순삽입정렬");
		System.out.print("요소수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1]; //보초법
		
		for(int i = 1; i<num+1; i++) { //보초법, a[0]보초로 사용
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		insertionSort(x, num+1); //보초법
		
		System.out.println("오름차순으로 정리합니다.");
		for(int i = 0; i<num+1; i++) { //보초법
			System.out.print("x["+i+"]:"+x[i]);
			if(i==0 ) System.out.print(" 보초");
			System.out.println();
		}
			
	}
	

}
