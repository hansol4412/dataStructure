package chapter1;
import java.util.Scanner;

public class Chapter1_2_12 {

	public static void main(String[] args) {
		// ���簢���� ����ϴ� ���α׷�
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�:");
		int n = Math.abs(stdIn.nextInt());
		for(int i =1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
