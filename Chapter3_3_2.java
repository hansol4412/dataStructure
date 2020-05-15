package chapter3;
import java.util.Scanner;

public class Chapter3_3_2 {
	static int seqSearch(int[]a , int n, int key) {
		a[n]= key;
		
		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			
			System.out.print("  "+ i +"|");
			for (int k = 0; k < n; k++)
				System.out.print("   "+ a[k]);
			System.out.println("\n   |");

			}

		/*
		 //while문으로 구성 
		  while(true){
		  	if(a[i]==key)
		  		break;
		  	i++;
		  }
		 */
		
		//for문으로 구성
		int i;
		for(i= 0; i<=n; i++) {
			if(a[i] ==key) break;
				}
		return i==n ? -1: i;
	}
	

	public static void main(String[] args) {
		//선형검색을 하는 프로그램을 작성하시오 (보초법 사용)
		//선형 검색의 스캐닝 과정을 상세히 나타내는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수:");
		int n = stdIn.nextInt();
		int[]a = new int[n+1];
		
		for(int i = 0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]=stdIn.nextInt();
		}
		System.out.print("검색할 값:");
		int key = stdIn.nextInt();
		System.out.print("   |");
		for(int j = 0 ; j<n; j++) {
			System.out.print("   "+ j );
		}
		System.out.println();
		System.out.println("---+-----------------------");
		int idx = seqSearch(a, n, key);		
		if(idx==-1) System.out.println("찾는 값이 없습니다.");
		else  System.out.println("찾는 값은 a["+idx+"]에 있습니다");
		
		
	}
	
	
		
}
