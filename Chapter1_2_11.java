package chapter1;
import java.util.Scanner;

public class Chapter1_2_11 {

	public static void main(String[] args) {
		// ���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		Scanner stdIn = new Scanner(System.in);

		int a;
		do {
		System.out.print("����� �Է��Ͻÿ�:");
		a = stdIn.nextInt();
		}while(a <= 0);
		
		int no=0;
		while(a>0){
			
			a = a / 10;
			no++;
		}
		System.out.println(no+"�ڸ����Դϴ�");
			
		

	}

}
