package chapter3;
import java.util.Scanner;

public class Chapter3_3_1 {
	static int binarySearch(int[] a, int n, int key){
		int pl = 0;
		int pr = n-1;
		/* while�� ���
		do {
			int pc = (pl+pr)/2;
			if(a[pc]<key) pl =pc+1;
			else if (a[pc]==key) return pc; 
			else pr = pr =pc-1;
		}while(pl<=pr);*/
		
		//for�� ���
		for(int i = pl; i<=pr; i++) {
			int pc = (pl+pr)/2;
			if(a[pc]<key) pl =pc+1;
			else if (a[pc]==key) return pc; 
			else pr = pr =pc-1;			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// �����˻��� �ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ڼ�:");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("������������ �����Ͻÿ�.");
		System.out.print("a[0]: ");
		a[0]= stdIn.nextInt();
		for(int i = 1; i<n; i++) {
		do {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
		}while(a[i]<a[i-1]);
		}
		System.out.print("�˻� ��:");
		int key = stdIn.nextInt();
		int ikey = binarySearch(a,n,key);
		
		if(ikey ==-1) System.out.println("ã�� ���� �����ϴ�");
		else System.out.println("ã�� ���� a["+ikey+"]�� �ֽ��ϴ�.");
	}

}
