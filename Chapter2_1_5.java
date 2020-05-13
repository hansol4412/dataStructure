package chapter2;

import java.util.Scanner;

public class Chapter2_1_5 {
	static void rcopy(int[] b, int num) {
		int[] a = new int[num];
		for(int i =0; i< b.length; i++) {
			a[b.length-i-1] = b[i];
			
		}
		System.out.print("배열 a: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// 배열 b의 모든 요소를 역순으로 배열 a에 복사하는 메서드를 작성하시오.
				Scanner stdInt = new Scanner(System.in);
				System.out.print("요소의 수를 입력하시오:");
				int num= stdInt.nextInt();
				
				int[] b = new int[num];
				for(int i = 0; i < b.length; i++) {
					System.out.print("b["+i+"]:");
					b[i]= stdInt.nextInt();
				}
				System.out.print("배열 b: ");
				for(int i = 0; i < b.length; i++) {
					System.out.print(b[i]+" ");
				}
				System.out.println();
				rcopy(b,num);
			}


	}


