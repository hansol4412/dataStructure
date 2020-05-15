package chapter3;
import java.util.Scanner;

public class Chapter3_3_1 {
	static int binarySearch(int[] a, int n, int key){
		int pl = 0;
		int pr = n-1;
		/* while문 사용
		do {
			int pc = (pl+pr)/2;
			if(a[pc]<key) pl =pc+1;
			else if (a[pc]==key) return pc; 
			else pr = pr =pc-1;
		}while(pl<=pr);*/
		
		//for문 사용
		for(int i = pl; i<=pr; i++) {
			int pc = (pl+pr)/2;
			if(a[pc]<key) pl =pc+1;
			else if (a[pc]==key) return pc; 
			else pr = pr =pc-1;			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// 이진검색을 하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수:");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("오름차순으로 정리하시오.");
		System.out.print("a[0]: ");
		a[0]= stdIn.nextInt();
		for(int i = 1; i<n; i++) {
		do {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
		}while(a[i]<a[i-1]);
		}
		System.out.print("검색 값:");
		int key = stdIn.nextInt();
		int ikey = binarySearch(a,n,key);
		
		if(ikey ==-1) System.out.println("찾는 값이 없습니다");
		else System.out.println("찾는 값은 a["+ikey+"]에 있습니다.");
	}

}
