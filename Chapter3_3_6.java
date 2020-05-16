package chapter3;
import java.util.Scanner;
import java.util.Arrays;

public class Chapter3_3_6 {

	public static void main(String[] args) {
		// Array클래스의 binarySearch 메소드를 이용해서 이진검색을 하고, 검색에 실페히면 삽입포인트의 값을 출력하시오.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수:");
		int n = stdIn.nextInt();
		int[] x = new int[n];
		
		System.out.print("x[0]:");
		x[0] = stdIn.nextInt();
		
		for(int i= 1; i<n; i++) {
			do {
			System.out.print("x["+i+"]: ");
			x[i] = stdIn.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("검색할 값:");
		int key = stdIn.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx<0) System.out.println("삽입 포인트의 값은 "+idx+"입니다");
		else
		System.out.println(key+"의 값은 x["+idx+"]에 있습니다.");


	}

}
