package chapter6;
import java.util.Scanner;

public class Chapter6_4_8 {
	static void binInsertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int key = a[i];
			int pl = 0; 
			int pr = i - 1; 
			int pc; 
			int pd; // �����ϴ� ��ġ�� �ε���

			do {
				pc = (pl + pr) / 2;
				if (a[pc] == key) // �˻�����
					break;
				else if (a[pc] < key)
					pl = pc + 1;
				else
					pr = pc - 1;
			} while (pl <= pr);
			
			
			pd = (pl <= pr) ? pc + 1 : pr + 1;
			for (int j = i; j > pd; j--)
				a[j] = a[j - 1];
			a[pd] = key;
		}
	}
	public static void main(String[] args) {
		// ������������
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ܼ���������");
		System.out.print("��Ҽ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; 
		
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		binInsertionSort(x, num); 
		
		System.out.println("������������ �����մϴ�.");
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
		}
			
	}
}
