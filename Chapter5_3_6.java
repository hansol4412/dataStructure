package chapter5;
import java.util.Scanner;
public class Chapter5_3_6 {
	static String[] a = {"A", "B", "C"};
	static void move(int num, int x, int y) {
		if(num>1)
			move(num-1, x, 6-x-y);
		System.out.println("����["+num+"]�� " + a[x-1]+"��տ��� "+ a[y-1] +"������� �ű�ϴ�");
		if(num>1)
			move(num-1, 6-x-y, y);
	}
	
	public static void main(String[] args) {
		// �ϳ��� ž�� �ϼ���Ű�� ���α׷��� �ۼ��ض�
		// ���ڰ� �ƴ� ���ڿ��� �̷���� ��� �̸��� ����Ͽ���
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� ����:");
		int n = stdIn.nextInt();
		move(n,1,3);
	}

}
