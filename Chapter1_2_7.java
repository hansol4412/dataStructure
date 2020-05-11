package chapter1;
import java.util.Scanner;

public class Chapter1_2_7 {

	public static void main(String[] args) {
		// for문을 사용하여 덧셈을 나타내는 식을 작성하시오.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터n까지의 합을 구합니다.");
		System.out.print("n의 값:");
		int n = stdIn.nextInt();
		int sum =0;
		
		for(int i = 1; i<=n; i++) {
			sum += i;
			if(i<n) System.out.print(i+"+");
			else System.out.print(i);
		}
		System.out.println("="+sum);
	}

}
