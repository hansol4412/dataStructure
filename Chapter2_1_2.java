package chapter2;
import java.util.Scanner;

public class Chapter2_1_2 {
	
	static void swap(int[] a, int first, int second){
		int t;
		System.out.println("a["+first+"]��  a["+second+"]�� ��ȯ�մϴ�.");
		t= a[first];
		a[first] = a[second];
		a[second]=t;
		for(int j =0; j<a.length; j++) {
			System.out.print(a[j]+" ");
		}
		
	}
	
	static void reverse(int[] b){
		for(int i = 0; i<b.length/2; i++) {
			swap(b, i, b.length-i-1);
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		// �迭��Ҹ� �������� ������� ������ ���α׷����� �ۼ��Ͻÿ�.
		
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
		
		reverse(x);
		System.out.println("���� ������ ���ƽ��ϴ�.");

	}

}
