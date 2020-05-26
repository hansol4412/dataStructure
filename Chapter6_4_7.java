package chapter6;
import java.util.Scanner;

public class Chapter6_4_7 {

	static void insertionSort(int[] a, int n ) {
		for (int i = 2; i < n; i++) { //���ʹ�
			int tmp = a[0] = a[i]; //���ʹ�
			int j;
			for (j=i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}
	
	public static void main(String[] args) {
		// �ܼ� ���� ������ �ϴ� ���α׷��� �ۼ��Ͻÿ�
		// �迭�� ù��° ���(a[0])���� �����͸� �������� �ʰ� a[1]���� �����͸� �����ϸ� a[0]�� ���ʷ��Ͽ� ������ ��ġ�� ������ ���� �� �ִ�
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ܼ���������");
		System.out.print("��Ҽ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num+1]; //���ʹ�
		
		for(int i = 1; i<num+1; i++) { //���ʹ�, a[0]���ʷ� ���
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		insertionSort(x, num+1); //���ʹ�
		
		System.out.println("������������ �����մϴ�.");
		for(int i = 0; i<num+1; i++) { //���ʹ�
			System.out.print("x["+i+"]:"+x[i]);
			if(i==0 ) System.out.print(" ����");
			System.out.println();
		}
			
	}
	

}
