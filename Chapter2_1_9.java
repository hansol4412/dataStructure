package chapter2;
import java.util.Scanner;
public class Chapter2_1_9 {
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}		
	};

	static int isLeap(int year) {
		return (year % 4== 0 && year % 100 != 0 || year % 400 == 0)?1:0;
	}
	static int dayOfYear(int year, int month, int day) {
		int days = day;
		for(int i = 0; i<month-1; i++)
		days += mdays[isLeap(year)][i];
		return days;
	}
	static int leftDayOfYear(int year, int month, int day) {
		int days = day;
		for(int i = 0; i<month-1; i++)
		days += mdays[isLeap(year)][i];
		int leftDays = ((year % 4== 0 && year % 100 != 0 || year % 400 == 0)?366:365) - days;
		return leftDays;
	}
	public static void main(String[] args) {
		// �� �� ��� �ϼ��� ���� �ϼ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��:"); 
		int year = stdIn.nextInt();
		System.out.print("��:"); 
		int month = stdIn.nextInt();
		System.out.print("��:"); 
		int day = stdIn.nextInt();
		
		System.out.println("�� ���� " + dayOfYear(year, month, day)+"�� ° �Դϴ�.");
		System.out.println("�� ���� ���� �� ���� " + leftDayOfYear(year, month, day) + "�Դϴ�.");
	}

}
