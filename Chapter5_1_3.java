package chapter5;

import java.util.Scanner;

public class Chapter5_1_3 {
	static int gcd(int x, int y) {
		 if(y==0)
		 	return x;
		 else 
		 	return gcd(y, x%y);
		 	}
	
	static int gcdArray(int[] a, int start, int num) {
		if (num == 1)
			return a[start];
		else if (num == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, num - 1));
		
	}
	
	public static void main(String[] args) {
		// 배열 a의 모든 요소의 최대공약수를 구하는 메소드를 작성하세요
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 몇 개의 최대 공약수를 구할까요?：");
		int num;
		do {
			num = stdIn.nextInt();
		} while (num <= 1);

		int[] x = new int[num]; // 길이 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
	}

}
