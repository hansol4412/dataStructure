package chapter5;
import java.util.Scanner;
public class Chapter5_3_6 {
	static String[] a = {"A", "B", "C"};
	static void move(int num, int x, int y) {
		if(num>1)
			move(num-1, x, 6-x-y);
		System.out.println("원반["+num+"]을 " + a[x-1]+"기둥에서 "+ a[y-1] +"기둥으로 옮김니다");
		if(num>1)
			move(num-1, 6-x-y, y);
	}
	
	public static void main(String[] args) {
		// 하노이 탑을 완성시키는 프로그램을 작성해라
		// 숫자가 아닌 문자열로 이루어진 기둥 이름을 출력하여라
		Scanner stdIn = new Scanner(System.in);
		System.out.println("원반 개수:");
		int n = stdIn.nextInt();
		move(n,1,3);
	}

}
