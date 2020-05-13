package chapter1;
import java.util.Scanner;

public class Chapter1_2_16 {

	static void spira(int n) {
		
		for(int i =1; i<=n; i++) {
				for(int j=1; j<= n-i ; j++)
					System.out.print(" ");
				for(int j=1; j<=2*i-1; j++)
					System.out.print(i%10);
				System.out.println();	
		}
		
	}
	
	public static void main(String[] args) {
		// n단의 피라미드를 출력하는 별메소드 작성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수를 입력하시오.");
		int n = Math.abs(stdIn.nextInt());
		spira(n);

	}

}
