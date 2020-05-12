package chapter1;
import java.util.Scanner;

public class Chapter1_2_10 {

	public static void main(String[] args) {
		// 두 정수를 받아 뺄셈을 출력하는 프로그램을 만드시오. 단, 변수 b에 입력한 값이 a이하이면 b를 다시 입력하시오.
		
		System.out.print("첫번째 수를 입력하시오:");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		
		int b;
		do {
			
			System.out.print("두번째 수를 입력하시오:");
			b = stdIn.nextInt();
			System.out.println("a보다 큰 값을 입력하시오.");
			
		}while( b <= a );
		
		int minus = b-a;
		System.out.println("b-a는 "+minus + "입니다.");
		
		

	}

}
