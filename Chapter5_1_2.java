package chapter5;
import java.util.Scanner;

public class Chapter5_1_2 {
	static int gcd(int x, int y) {
		while(y != 0) {
			int t = x;
			x = y;
			y = t%y; 	
		}
		return x;
		
		/*재귀함수 사용
		 static int gcd(int x, int y) {
		 if(y==0)
		 	return x;
		 else 
		 	return gcd(y, x%y);
		 	}
		 */
	}

	public static void main(String[] args) {
		// 재귀 메소드를 호출하지 않고 최대공약수를 구하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.println(" 두 정수의 최대 공약수를 구합니다.");
		System.out.print("정수를 입력하시오:");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하시오:");
		int y = stdIn.nextInt();
		//gcd(x,y);
		System.out.println("최대공약수는 "+gcd(x,y)+"입니다.");
	}

}
