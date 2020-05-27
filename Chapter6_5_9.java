package chapter6;
import java.util.Scanner;

public class Chapter6_5_9 {
	static void shellSort1(int[] a, int n) {
		int changeNum = 0;
	for (int h= n/2; h>0; h /= 2) 
		for(int i = h; i<n; i++) {
			int j;
			int temp = a[i];
			for(j = i-h; j>=0 && a[j]>temp; j -= h ) {
				changeNum++;
				a[j+h] = a[j];
				
			}
			a[j+h] =temp;
			changeNum++;
		}
	System.out.println("�̵�Ƚ��: "+ changeNum);
	}

	static void shellSort2(int[] a, int n) {
		int changeNum = 0;
		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1)
			;

		for (; h > 0; h /= 3)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					changeNum++;
				}
				a[j + h] = tmp;
				changeNum++;
			}
		System.out.println("�̵�Ƚ��: "+ changeNum);
		}

	
	public static void main(String[] args) {
		// ������
		// ����1�� ����2�� ����� �̵� Ƚ���� ���϶�
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��Ҽ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; 
		int[] y = new int[num];
		
		
		
		
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		System.arraycopy(x, 0, y, 0, x.length);
		
		System.out.println("������ - ����1");
		shellSort1(x, num); 
		System.out.println("������������ �����մϴ�.");
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
		}
		System.out.println();
		
		System.out.println("������ - ����2");
		shellSort2(y, num);
		System.out.println("������������ �����մϴ�.");
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
			
		}
			
	}
}
