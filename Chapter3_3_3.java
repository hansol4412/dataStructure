package chapter3;

import java.util.Scanner;

public class Chapter3_3_3 {

	static int seqSearch(int[]a , int n, int key, int[] idx) {
		int i;
		int ptr=0;
		for(i= 0; i<n; i++) {
			if(a[i] ==key) {
				idx[ptr] = i;
				ptr++;	
			}
			}
		return ptr;
	}
	

	public static void main(String[] args) {
		/* ��ڼ��� n�� �迭 a���� key�� ��ġ�ϴ� ��� ����� �ε����� �迭 idx�� �� �պ���
		 * ������� �����ϰ�, ��ġ�� ��ڼ��� ��ȯ�ϴ� �޼ҵ带 �ۼ��ϼ���. ���� ��� ��ڼ��� 8�� �迭 a��
		 * ��Ұ� { 1, 9, 2, 9, 4, 6, 7, 9}�̰� key�� 9�̸� idx�� {1, 3, 7}�� �����ϰ� 3�� ���c�Ѵ�.
		 */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ڼ�:");
		int n = stdIn.nextInt();
		int[]a = new int[n+1];
		
		for(int i = 0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]=stdIn.nextInt();
		}
		System.out.print("�˻��� ��:");
		int key = stdIn.nextInt();
		int[] idx = new int[5];
		int idxNum = seqSearch(a, n, key, idx);		
		if(idxNum==0) System.out.println("ã�� ���� �����ϴ�.");
		else  {
			System.out.println("ã�� ���� �� "+idxNum+"���� �ֽ��ϴ�");
			for(int j = 0; j<idxNum; j++) {
				System.out.print("idx["+idx[j]+"] ");
			}
		}
		
		
	}
	
	
		
}