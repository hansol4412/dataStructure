package chapter3;
import java.util.Scanner;

public class Chapter3_3_2 {
	static int seqSearch(int[]a , int n, int key) {
		a[n]= key;
		
		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			
			System.out.print("  "+ i +"|");
			for (int k = 0; k < n; k++)
				System.out.print("   "+ a[k]);
			System.out.println("\n   |");

			}

		/*
		 //while������ ���� 
		  while(true){
		  	if(a[i]==key)
		  		break;
		  	i++;
		  }
		 */
		
		//for������ ����
		int i;
		for(i= 0; i<=n; i++) {
			if(a[i] ==key) break;
				}
		return i==n ? -1: i;
	}
	

	public static void main(String[] args) {
		//�����˻��� �ϴ� ���α׷��� �ۼ��Ͻÿ� (���ʹ� ���)
		//���� �˻��� ��ĳ�� ������ ���� ��Ÿ���� ���α׷��� �ۼ��Ͻÿ�.
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
		System.out.print("   |");
		for(int j = 0 ; j<n; j++) {
			System.out.print("   "+ j );
		}
		System.out.println();
		System.out.println("---+-----------------------");
		int idx = seqSearch(a, n, key);		
		if(idx==-1) System.out.println("ã�� ���� �����ϴ�.");
		else  System.out.println("ã�� ���� a["+idx+"]�� �ֽ��ϴ�");
		
		
	}
	
	
		
}
