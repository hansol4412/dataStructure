package chapter1;
import java.util.Scanner;

public class Chapter1_2_10 {

	public static void main(String[] args) {
		// �� ������ �޾� ������ ����ϴ� ���α׷��� ����ÿ�. ��, ���� b�� �Է��� ���� a�����̸� b�� �ٽ� �Է��Ͻÿ�.
		
		System.out.print("ù��° ���� �Է��Ͻÿ�:");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		
		int b;
		do {
			
			System.out.print("�ι�° ���� �Է��Ͻÿ�:");
			b = stdIn.nextInt();
			System.out.println("a���� ū ���� �Է��Ͻÿ�.");
			
		}while( b <= a );
		
		int minus = b-a;
		System.out.println("b-a�� "+minus + "�Դϴ�.");
		
		

	}

}
