package chapter4;

import java.util.Scanner;

public class Chapter4_1_3 {
	public enum AorB {
		StackA, StackB 
	}
	public static void main(String[] args) {
		// 하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택클래스를 만드세요
		// 스택에 저장하는 데이터는 int형 값으로 배열의 처음과 끝을 사용하세요.

		Scanner stdIn = new Scanner(System.in);
		XIntStack s = new XIntStack(6);
		
	
	
		while(true){
			
			System.out.println("메뉴를 선택하시오");
			System.out.print("(1)푸시  (2)팝  (3)피크  (4)인덱스  (5)클리어  (6)스텍비움여부  (7)스택풀여부 (8)덤프  (0)종료 ");
			int menu = stdIn.nextInt();
			System.out.print("Stack1: 10     Stack2: 20    =>");
			int sw = stdIn.nextInt();
			//System.out.println("현재 데이터 수 :"+ s.size(sw) +" / " + s.capacity());
			if(menu == 0) break;
			
			int x;
			boolean t;
			switch(menu) {
			case 1:
				System.out.print("데이터:");
				x= stdIn.nextInt();
				try {
					s.push(sw,x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찾습니다.");
				}
				break;
			
			case 2:
				try {
					x= s.pop(sw);
					System.out.println("팝한 데이터는 " + x +"입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
				break;
				
			case 3:try {
				x= s.peek(sw);
				System.out.println("피크한 데이터는 " + x +"입니다.");
			}catch(IntStack.EmptyIntStackException e) {
				System.out.println("스택이 비었습니다.");
			}
				break;
				
			case 4:
				System.out.println("찾고 싶은 데이터:");
				x= stdIn.nextInt();
				int key = s.indexOf(sw,x);
				if(key==-1) System.out.println("찾는 값이 없습니다.");
				else
					System.out.println("찾는 값은 stk["+key+"]에 있습니다");
				break;
				
			case 5:
				System.out.println("스택을 클리어 합니다.");
				s.clear(sw);
				break;
				
			case 6:
				t = s.isEmpty(sw);
				if(t==true) System.out.println("스택이 비워져있습니다");
				else System.out.println("스택에 값이 있습니다.");
				break;
				
			case 7:
				t = s.isFull();
				if(t==true) System.out.println("스택이 꽉 찼습니다");
				else System.out.println("스택에 여유 공간이 있습니다.");
				break;
				
			case 8:
				s.dump(sw);
				break;
			
			}
		}
	}

}