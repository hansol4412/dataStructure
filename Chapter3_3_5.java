package chapter3;
import java.util.Scanner;

public class Chapter3_3_5 {
	static int binSearch(int[] a, int n, int key) {
		int pl=0;
		int pr = n-1;
		do {
			int pc= (pl+pr)/2;
			
			if(a[pc]==key) {
				while(pc>pl){
					pc--;
					if(a[pc-1]<key) break;
				}
					return pc;
			}	
			else if(a[pc]<key) pl= pc+1;
			else pr = pc-1;
		}while(pl<= pr);
			
			return -1;
	}
	public static void main(String[] args) {
		// ���� �˻� ���α׷��� �˻��� ���� ���� ���� ���� ��Ұ� �ϳ� �̻��� ��� �� ��� �߿��� �� ���� ��Ҵ� ã�� ���մϴ�.
		// �� �� ��Ҹ� �Y�� �޼ҵ带 �ۼ��� ������.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ڼ�:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		System.out.print("a[o]:");
		a[0] = stdIn.nextInt();
		
		for(int i = 1; i<n; i++) {
			do {
				System.out.print("a["+i+"]:");
				a[i]= stdIn.nextInt();
			}while(a[i]<a[i-1]);
		}
		System.out.print("�˻��� ��:");
		int key = stdIn.nextInt();
		
		int idx = binSearch(a, n, key);
		
		if(idx==-1) System.out.println("ã�� ���� �����ϴ�.");
		else System.out.println("ã�� ���� a["+idx+"]�� �ֽ��ϴ�.");
	}

}
