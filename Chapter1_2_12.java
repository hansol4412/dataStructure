package chapter1;
import java.util.Scanner;

public class Chapter1_2_12 {

	public static void main(String[] args) {
		// 정사각형을 출력하는 프로그램
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수를 입력하시오:");
		int n = Math.abs(stdIn.nextInt());
		for(int i =1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
