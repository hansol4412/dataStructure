package chapter1;
import java.util.Scanner;

public class Chapter1_2_9 {

	static int sumof(int a, int b) {
		int sum = 0;
		for(int i = a; i<=b; i++) {
			sum+= i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// 두 수를 입력 받아 그 사이의 수의 덧셈을 구하라
		Scanner stdIn = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하시오");
		int a = stdIn.nextInt();
		System.out.print("두번째 수를 입력하시오");
		int b = stdIn.nextInt();
		int sum = sumof(a,b);
				System.out.println(a+"와 "+ b +"사이의 합은 "+ sum +"입니다.");
		
		
	}

}
