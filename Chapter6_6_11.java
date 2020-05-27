package chapter6;
import java.util.Scanner;
public class Chapter6_6_11 {
	public static void swap(int[] x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
	static void quickSort(int[] a, int left, int right) {
		
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);
		lstack.push(left);
		rstack.push(right);
		System.out.printf("a[%d]~a[%d]�� �����ϴ� ������ ���ÿ� Ǫ���մϴ�.\n", left, right);
		
		while(lstack.isEmpty() != true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left+right)/2];
			System.out.printf("���ÿ��� �����ϴ� ������ ���½��ϴ�.a[%d]~a[%d]�� �����մϴ�.\n", left, right);
			do {
				while (a[pl]<x) pl++;
				while (a[pr] > x) pr--;
				if(pl<=pr) {
					System.out.println(a[pl]+"�� " +a[pr]+"�� ��ȯ�մϴ�.");
					swap(a, pl++, pr--);	
					
				}
			}while(pl<= pr);
			
			if(left <pr) {
				lstack.push(left);
				rstack.push(pr);
				System.out.printf("a[%d]~a[%d]�� �����ϴ� ������ ���ÿ� Ǫ���մϴ�.\n", left, pr);

			}
			if(right > pl) {
				lstack.push(pl);
				rstack.push(right);
				System.out.printf("a[%d]~a[%d]�� �����ϴ� ������ ���ÿ� Ǫ���մϴ�.\n", pl, right);

			}
		}
		
	
	}
	
	public static void main(String[] args) {
			// ��������� �������� ������ ����� �޼ҵ带 �ۼ��Ͽ���
			// Ǫ��, �� ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������");
		System.out.print("��Ҽ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; 
		
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		quickSort(x,0,num-1); 
		
		System.out.println("������������ �����մϴ�.");
		for(int i = 0; i<num; i++) { 
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
		}
			
	}
}
	