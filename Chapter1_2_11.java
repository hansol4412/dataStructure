package chapter1;
import java.util.Scanner;

public class Chapter1_2_11 {

	public static void main(String[] args) {
		// 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
		
		Scanner stdIn = new Scanner(System.in);

		int a;
		do {
		System.out.print("양수를 입력하시오:");
		a = stdIn.nextInt();
		}while(a <= 0);
		
		int no=0;
		while(a>0){
			
			a = a / 10;
			no++;
		}
		System.out.println(no+"자리수입니다");
			
		

	}

}
