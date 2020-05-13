package chapter2;
import java.util.Scanner;

public class Chapter2_1_2 {
	
	static void swap(int[] a, int first, int second){
		int t;
		System.out.println("a["+first+"]와  a["+second+"]를 교환합니다.");
		t= a[first];
		a[first] = a[second];
		a[second]=t;
		for(int j =0; j<a.length; j++) {
			System.out.print(a[j]+" ");
		}
		
	}
	
	static void reverse(int[] b){
		for(int i = 0; i<b.length/2; i++) {
			swap(b, i, b.length-i-1);
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		// 배열요소를 역순으로 정려라는 과정을 프로그램으로 작성하시오.
		
		Scanner stdInt = new Scanner(System.in);
		System.out.print("요소의 수를 입력하시오:");
		int num= stdInt.nextInt();
		
		int[] x = new int[num];
		for(int i = 0; i < x.length; i++) {
			System.out.print("x["+i+"]:");
			x[i]= stdInt.nextInt();
		}
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		
		reverse(x);
		System.out.println("역순 정렬을 마쳤습니다.");

	}

}
