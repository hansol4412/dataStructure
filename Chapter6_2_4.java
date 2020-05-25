package chapter6;
import java.util.Scanner;

public class Chapter6_2_4 {
	public static void swap(int[] x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
	public static void bubbleSort(int[] x, int num) {
		int compareNum=0;
		int swapNum = 0;
		int k = 0;
		int passNum= 0; 
		while(k<num-1) {
			System.out.println("�н�"+(passNum+1));
			int last = num-1;
			for(int j = num-1; j>k; j--) {
				for (int m = 0; m < num - 1; m++)
				System.out.printf("%3d %c", x[m], (m != j - 1) ? ' ' : (x[j - 1] > x[j]) ? '+' : '-');
			System.out.printf("%3d\n", x[num - 1]);
			compareNum++;
				if(x[j-1]>x[j]) {
					swap(x, j-1, j);
					swapNum++;
					last = j;
				}
			}
			k= last;
			passNum++;
		}
		System.out.println("�񱳸� "+ compareNum +"ȸ �߽��ϴ�.");
		System.out.println("��ȯ�� "+ swapNum +"ȸ �߽��ϴ�.");
	}
	
	public static void main(String[] args) {
		// ���� �����ϴ� ���α׷��� �ڼ��� ����Ͻÿ�
		// �� ��� ���̿� ��ȯ�� �����ϸ� "+"��, ��ȯ�� �������� ������ "-"�� ����Ͻÿ�
		// �� Ƚ���� ��ȯ Ƚ���� ����Ͻÿ�.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�������� - ����3");
		System.out.print("��Ҽ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i]= stdIn.nextInt();
		}
		
		bubbleSort(x, num);
		
		
	}
}
