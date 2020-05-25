package chapter6;
import java.util.Scanner;

public class Chapter6_2_1 {
	public static void swap(int[] x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
	public static void bubbleSort(int[] x, int num) {
		for(int i = num-1; i>0; i--) { //�� ���� ����
			for(int j = 0; j<i; j++) { // �տ��� ���� ���Ͽ�, �����Ǳ� ������ ��
				if(x[j]>x[j+1]) swap(x, j, j+1);
			}
		}
	}
	public static void main(String[] args) {
		//���������� �����Ͻÿ�
		//��ȯ�� ó��(����)���� �����Ͽ�, ���� ū ���� ��� ������ �Ű����ϴ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�������� - ����1");
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
