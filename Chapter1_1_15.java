package chapter1;
import java.util.Scanner;
public class Chapter1_1_15 {
	
	static void triangleLB(int n){
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
				
				}
			System.out.println();
		}
			
	}
	
	static void triangleLU(int n){
		for(int i = 1; i<=n; i++) {
			for(int j=1; j <= n+1-i ; j++) {
				System.out.print("*");
				
				}
			System.out.println();
		}
	}
	
	static void triangleRU(int n){
		for (int i = 1; i <= n; i++) { 				
			for (int j = 1; j <= i - 1; j++) 		
				System.out.print(" ");
			for (int j = 1; j <= n - i + 1; j++) 	
				System.out.print("*");
			System.out.println();					
		}
	}
	
	static void triangleRB(int n){
		for (int i = 1; i <= n; i++) { 				
			for (int j = 1; j <= n-i; j++) 		
				System.out.print(" ");
			for (int j = 1; j <= i ; j++) 	
				System.out.print("*");
			System.out.println();					
		}
		}
	

	public static void main(String[] args) {
		//직각 삼각형을 만드는 함수를 작성하시오
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수를 입력하세요");
		int n = Math.abs(stdIn.nextInt());
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
		triangleLB(n);
		System.out.println("왼쪽 위가 직각인 이등변 삼각형");
		triangleLU(n);
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
		triangleRU(n);
		System.out.println("오른쪽 위가 직각인 이등변 삼각형");
        triangleRB(n);
		
		}
	

}
