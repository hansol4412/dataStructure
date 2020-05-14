package chapter2;
import java.util.Scanner;

public class Chapter2_1_6 {
	
	static int cardConv(int num, int cd, char[] cno){
		
		int digits=0;
		String cdChar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			//���� ���� ������ ��ȯ�Ͽ� �迭�� �Ʒ��ڸ� ���� �־�ΰ� �ڸ����� ��ȯ�մϴ�. 
			cno[digits] = cdChar.charAt(num % cd);
			num = num / cd;
			digits++;
		}while(num>0);
		
		//�Ʒ��ڸ����� �־���� ���� �迭�� ���ڸ��� �ٲٴ� ����
		for(int j=0; j<digits/2; j++) {
			char a = cno[j];
			cno[j] = cno[digits-j-1];
			cno[digits-j-1] = a;	
		}
		return digits;
	}
	
	public static void main(String[] args) {
		// �Է¹��� 10������ 2~36������ ��� ��ȯ�Ͽ� ��Ÿ���� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		
		int num;	//��ȯ�Ϸ��� 10����
		int cd;		//���
		int dno; 	//��ȯ ���� �ڸ���
		int retry;	//�����?
		char[] cno = new char[32];	//��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		do {
			do {
				System.out.print("��ȯ�� 10����:");
				num = stdIn.nextInt();
			}while(num<0); //�Է��ϴ� 10������ ������ ��쿡 �ٽ� �Է��ؾ���
			
			do {
				System.out.print("��ȯ�� ���:");
				cd= stdIn.nextInt();
			}while(!(cd>=2&&cd<=36));
			
			dno = cardConv(num, cd, cno);
			
			System.out.print(cd+"�����δ� ");
			for(int i = 0; i<dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.println("�ѹ� �� �� ���? ( 1. yes / 2. no )");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}
