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
		// �� ���� �Է� �޾� �� ������ ���� ������ ���϶�
		Scanner stdIn = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻÿ�");
		int a = stdIn.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ�");
		int b = stdIn.nextInt();
		int sum = sumof(a,b);
				System.out.println(a+"�� "+ b +"������ ���� "+ sum +"�Դϴ�.");
		
		
	}

}
