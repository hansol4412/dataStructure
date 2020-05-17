package chapter3;
import java.util.Scanner;

public class Chapter3_3_5 {
	static int binSearch(int[] a, int n, int key) {
		int pl=0;
		int pr = n-1;
		do {
			int pc= (pl+pr)/2;
			
			if(a[pc]==key) {
				while(pc>pl){
					pc--;
					if(a[pc-1]<key) break;
				}
					return pc;
			}	
			else if(a[pc]<key) pl= pc+1;
			else pr = pc-1;
		}while(pl<= pr);
			
			return -1;
	}
	public static void main(String[] args) {
		// 이진 검색 프로그램은 검색할 값과 같은 같을 갖는 요소가 하나 이상일 경우 그 요소 중에서 맨 앞의 요소는 찾지 못합니다.
		// 맨 앞 요소를 팢는 메소드를 작성해 보세요.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		System.out.print("a[o]:");
		a[0] = stdIn.nextInt();
		
		for(int i = 1; i<n; i++) {
			do {
				System.out.print("a["+i+"]:");
				a[i]= stdIn.nextInt();
			}while(a[i]<a[i-1]);
		}
		System.out.print("검색할 값:");
		int key = stdIn.nextInt();
		
		int idx = binSearch(a, n, key);
		
		if(idx==-1) System.out.println("찾는 값이 없습니다.");
		else System.out.println("찾는 값은 a["+idx+"]에 있습니다.");
	}

}
