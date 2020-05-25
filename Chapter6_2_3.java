package chapter6;
import java.util.Scanner;

public class Chapter6_2_3 {
	public static void swap(int[] x, int idx1, int idx2) {
		 
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
		
	}
	public static void bubbleSort(int[] x, int num) {
		int compareNum=0;
		int swapNum = 0;
		for(int i = 0; i<num-1; i++) {
			System.out.println("�н�"+(i+1));
			int excahgeNum =0; //����2
			
			for(int j = num-1; j>i; j--) {
				for (int m = 0; m < num - 1; m++)
					System.out.printf("%3d %c", x[m], (m != j - 1) ? ' ' : (x[j - 1] > x[j]) ? '+' : '-');
				System.out.printf("%3d\n", x[num - 1]);
				compareNum++;
				if(x[j-1]>x[j]) {
					swap(x, j-1, j);
					swapNum++;
					excahgeNum++; //����2
				}		
			}
			
			if(excahgeNum==0) break;
			for (int m = 0; m < num; m++)
				System.out.printf("%3d  ", x[m]);
			System.out.println();
			
		}
		
		System.out.println("�񱳸� "+ compareNum +"ȸ �߽��ϴ�.");
		System.out.println("��ȯ�� "+ swapNum +"ȸ �߽��ϴ�.");
	}
	public static void main(String[] args) {
		// ���� �����ϴ� ���α׷��� �ڼ��� ����Ͻÿ�
		// �� ��� ���̿� ��ȯ�� �����ϸ� "+"��, ��ȯ�� �������� ������ "-"�� ����Ͻÿ�
		// �� Ƚ���� ��ȯ Ƚ���� ����Ͻÿ�.
		// � �н����� ��ȯȽ���� 0�̸� �� �̻� ������ ��Ұ� ���� ������ �۾��� �����
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�������� - ����2");
		System.out.print("��Ҽ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		bubbleSort(x, num);
		
		System.out.println("������������ �����մϴ�.");
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:"+x[i]);
			System.out.println();
		}
		
		
	}
}
