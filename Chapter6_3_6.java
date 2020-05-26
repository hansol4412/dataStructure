package chapter6;
import java.util.Scanner;

public class Chapter6_3_6 {
	public static void swap(int[] x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i=0; i <n-1; i++) {
			
			int min = i;
			for(int j = i+1; j<n; j++) 
				if(a[j] < a[min]) 
					min = j;
	
			for (int m = 0; m < n; m++)
				System.out.printf((m == i) ? "  * " : (m == min) ? "   + " : "     ");
			System.out.println();
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
			
			swap(a, i, min);
			
		}
		
	}

	public static void main(String[] args) {
		// �ܼ����� ���� �޼ҵ带 �ۼ��Ͻÿ�
		// �ڼ��� �ܼ� ���� ������ ������ �����ֽÿ�.
		// �������� ���� �κ��� ù��1�� ��� ������ *��, �������� ���� �κ��� ���� ���� ��� ������ +�� ����Ͻÿ�
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ܼ���������");
		System.out.print("��Ҽ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		selectionSort(x, num);
		
		System.out.println("������������ �����մϴ�.");
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
	}

	}
}
