package chapter1;
import java.util.Scanner;
public class Chapter1_2_8 {
	public static void main(String[] args) {
		// ���콺�� ����
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�");
		int n = stdIn.nextInt();
		int sum = 0;
		if(n%2==0) {
			sum= (1+n)*(n/2);
		}
		else {
			sum = ((1+n)*(int)(n/2)) + (1+n)/2;
		}
		System.out.println("1���� " + n+"������ ���� " + sum);
	
	}
}
