package chapter5;
import java.util.Scanner;
public class Chapter5_1_1 {
	static int factorial(int x) {
		int fac = 1;
		 while(x>0){
			 fac = fac*x;
			 x--;
			 }
		 return fac;
	}
		
		/* 
		 * for���� ���
		  int fac = 1;
		for(int i = x; i>1; i--) {
			fac = fac*i;
		}
		return fac;
		
		 */
		
		/*
		 * ����Լ� ȣ��
		 static int factorial(int x){
		 if(x>0) return n * factorial(n-1);
		 else return 1;
		 }
		 */
	
	
		
	
	public static void main(String[] args) {
		// ���丮���� ���ϴ� �Լ��� ����Լ��� ������� �ʰ� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int x = stdIn.nextInt();
		
		System.out.println(x+"�� ���丮�� ���� "+ factorial(x)+"�Դϴ�");
	}
}
