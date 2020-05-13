package chapter2;
import java.util.Scanner;


public class Chapter2_1_3 {
	static int sum(int[] a) {
		int sum=0;
		for(int i = 0; i<a.length; i++) {
			sum+= a[i];
		}
		return sum;	
	}

	public static void main(String[] args) {
		// 배열의 모든 요소의 합게를 구하여 반환하는 메소드를 작성하시오.
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
		int sum = sum(x);
		System.out.println("요소의 합은 "+sum+"입니다.");
	}

}
