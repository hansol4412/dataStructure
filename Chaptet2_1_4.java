package chapter2;
import java.util.Scanner;

public class Chaptet2_1_4 {
	static void copy(int[] b, int num) {
		int[] a = new int[num];
		for(int i =0; i< b.length; i++) {
			a[i] = b[i];
			
		}
		System.out.print("�迭 a: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// �迭 b�� ��� ��Ҹ� �迭 a�� �����ϴ� �޼��带 �ۼ��Ͻÿ�.
		Scanner stdInt = new Scanner(System.in);
		System.out.print("����� ���� �Է��Ͻÿ�:");
		int num= stdInt.nextInt();
		
		int[] b = new int[num];
		for(int i = 0; i < b.length; i++) {
			System.out.print("b["+i+"]:");
			b[i]= stdInt.nextInt();
		}
		System.out.print("�迭 b: ");
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		copy(b,num);
	}

}
