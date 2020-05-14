package chapter2;
import java.util.Scanner;

public class Chapter2_1_6 {
	
	static int cardConv(int num, int cd, char[] cno){
		
		int digits=0;
		String cdChar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			//정수 값을 진수로 변환하여 배열에 아랫자리 부터 넣어두고 자릿수를 반환합니다. 
			cno[digits] = cdChar.charAt(num % cd);
			num = num / cd;
			digits++;
		}while(num>0);
		
		//아랫자리부터 넣어놓은 수를 배열의 윗자리로 바꾸는 과정
		for(int j=0; j<digits/2; j++) {
			char a = cno[j];
			cno[j] = cno[digits-j-1];
			cno[digits-j-1] = a;	
		}
		return digits;
	}
	
	public static void main(String[] args) {
		// 입력받은 10진수를 2~36진수로 기수 변환하여 나타내는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		
		int num;	//변환하려는 10진수
		int cd;		//기수
		int dno; 	//변환 후의 자리수
		int retry;	//재시작?
		char[] cno = new char[32];	//변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		do {
			do {
				System.out.print("변환될 10진수:");
				num = stdIn.nextInt();
			}while(num<0); //입력하는 10진수가 음수일 경우에 다시 입력해야함
			
			do {
				System.out.print("변환할 기수:");
				cd= stdIn.nextInt();
			}while(!(cd>=2&&cd<=36));
			
			dno = cardConv(num, cd, cno);
			
			System.out.print(cd+"진수로는 ");
			for(int i = 0; i<dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.println("한번 더 할 까요? ( 1. yes / 2. no )");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}
