package chapter5;
import java.util.Scanner;

public class Chapter5_1_2 {
	static int gcd(int x, int y) {
		while(y != 0) {
			int t = x;
			x = y;
			y = t%y; 	
		}
		return x;
		
		/*����Լ� ���
		 static int gcd(int x, int y) {
		 if(y==0)
		 	return x;
		 else 
		 	return gcd(y, x%y);
		 	}
		 */
	}

	public static void main(String[] args) {
		// ��� �޼ҵ带 ȣ������ �ʰ� �ִ������� ���Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.println(" �� ������ �ִ� ������� ���մϴ�.");
		System.out.print("������ �Է��Ͻÿ�:");
		int x = stdIn.nextInt();
		System.out.print("������ �Է��Ͻÿ�:");
		int y = stdIn.nextInt();
		//gcd(x,y);
		System.out.println("�ִ������� "+gcd(x,y)+"�Դϴ�.");
	}

}
