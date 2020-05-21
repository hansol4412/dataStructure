package chapter5;
import java.util.Scanner;
public class Chapter5_1_1 {
	static int factorial(int x) {
		int fac = 1;
		 while(x>0){
			 fac = fac*x;
			 x--;
			 }
		 return fac;
	}
		
		/* 
		 * for문을 사용
		  int fac = 1;
		for(int i = x; i>1; i--) {
			fac = fac*i;
		}
		return fac;
		
		 */
		
		/*
		 * 재귀함수 호출
		 static int factorial(int x){
		 if(x>0) return n * factorial(n-1);
		 else return 1;
		 }
		 */
	
	
		
	
	public static void main(String[] args) {
		// 팩토리얼을 구하는 함수를 재귀함수를 사용하지 않고 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int x = stdIn.nextInt();
		
		System.out.println(x+"의 팩토리얼 값은 "+ factorial(x)+"입니다");
	}
}
