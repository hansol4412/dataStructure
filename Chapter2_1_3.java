package chapter2;
import java.util.Scanner;


public class Chapter2_1_3 {
	static int sum(int[] a) {
		int sum=0;
		for(int i = 0; i<a.length; i++) {
			sum+= a[i];
		}
		return sum;	
	}

	public static void main(String[] args) {
		// �迭�� ��� ����� �հԸ� ���Ͽ� ��ȯ�ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
		Scanner stdInt = new Scanner(System.in);
		System.out.print("����� ���� �Է��Ͻÿ�:");
		int num= stdInt.nextInt();
		
		int[] x = new int[num];
		for(int i = 0; i < x.length; i++) {
			System.out.print("x["+i+"]:");
			x[i]= stdInt.nextInt();
		}
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		int sum = sum(x);
		System.out.println("����� ���� "+sum+"�Դϴ�.");
	}

}
