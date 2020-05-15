package chapter2;
import java.util.Scanner;

public class Chapter2_2_11 {
	int year;
	int month;
	int date;
	
	Chapter2_2_11(int year, int month, int date){
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	static int[][] monthDays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
	};
	
	static int isYear(int year) {
		return (year % 4 == 0 && year%100 != 0) || year%400==0 ? 1:0 ;
	}
	
	Chapter2_2_11 after(int n) {
		Chapter2_2_11 temp = new Chapter2_2_11(this.year, this.month, this.date);
		if(n<0) before(-n);
		
		temp.date +=n;
		while(temp.date > monthDays[(isYear(temp.year))][temp.month-1]) {
			temp.date -= monthDays[(isYear(temp.year))][temp.month-1];
			if(++temp.month>12) {
				temp.year++;
				temp.month = 1;
			}
		}
		return temp;
		
	}
	
	Chapter2_2_11 before(int n) {
		Chapter2_2_11 temp = new Chapter2_2_11(this.year, this.month, this.date);
		if(n<0) after(-n);
		
		temp.date -=n;
		while(temp.date<1) {
			if(--temp.month<1) {
				temp.year--;
				temp.month =12;
			}
			temp.date += monthDays[isYear(temp.year)][temp.month-1];
		}
		return temp;
	}

	public static void main(String[] args) {
		// 날짜를 생성자로 받고 n일 후와 n일 전의 날짜를 구하시오
		Scanner stdIn = new Scanner(System.in);
		System.out.print("년:");
		int year = stdIn.nextInt();
		System.out.print("월:");
		int month = stdIn.nextInt();
		System.out.print("일:");
		int date = stdIn.nextInt();
		Chapter2_2_11 temp = new Chapter2_2_11(year, month, date); 
		
		System.out.print("몇일의 앞과 뒤의 날짜를 구할까요?:");
		int n = stdIn.nextInt();
		Chapter2_2_11 dayAfter = temp.after(n);
		System.out.println(n+"일 후의 날짜는 "+dayAfter.year+"년  "+ dayAfter.month+"월 "+ dayAfter.date+ "일");
		Chapter2_2_11 dayBefore = temp.before(n);
		System.out.println(n+"일 전의 날짜는 "+dayBefore.year+"년  "+ dayBefore.month+"월 "+ dayBefore.date+ "일");
		
	}

}
