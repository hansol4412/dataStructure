package chapter1;
import java.util.Scanner;
public class Chapter1_2_8 {
	public static void main(String[] args) {
		// 가우스의 덧셈
		Scanner stdIn = new Scanner(System.in);
		System.out.print("수를 입력하시오");
		int n = stdIn.nextInt();
		int sum = 0;
		if(n%2==0) {
			sum= (1+n)*(n/2);
		}
		else {
			sum = ((1+n)*(int)(n/2)) + (1+n)/2;
		}
		System.out.println("1부터 " + n+"까지의 합은 " + sum);
	
	}
}
