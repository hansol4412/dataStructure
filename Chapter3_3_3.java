package chapter3;

import java.util.Scanner;

public class Chapter3_3_3 {

	static int seqSearch(int[]a , int n, int key, int[] idx) {
		int i;
		int ptr=0;
		for(i= 0; i<n; i++) {
			if(a[i] ==key) {
				idx[ptr] = i;
				ptr++;	
			}
			}
		return ptr;
	}
	

	public static void main(String[] args) {
		/* 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터
		 * 순서대로 저장하고, 일치한 요솟수를 반환하는 메소드를 작성하세요. 예를 들어 요솟수가 8인 배열 a의
		 * 요소가 { 1, 9, 2, 9, 4, 6, 7, 9}이고 key가 9이면 idx에 {1, 3, 7}을 저장하고 3을 반홤한다.
		 */
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
		int[] idx = new int[5];
		int idxNum = seqSearch(a, n, key, idx);		
		if(idxNum==0) System.out.println("찾는 값이 없습니다.");
		else  {
			System.out.println("찾는 값은 총 "+idxNum+"개가 있습니다");
			for(int j = 0; j<idxNum; j++) {
				System.out.print("idx["+idx[j]+"] ");
			}
		}
		
		
	}
	
	
		
}