package chapter1;
import java.util.Scanner;

public class Chapter1_2_7 {

	public static void main(String[] args) {
		// for���� ����Ͽ� ������ ��Ÿ���� ���� �ۼ��Ͻÿ�.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1����n������ ���� ���մϴ�.");
		System.out.print("n�� ��:");
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
