package chapter4;

import java.util.Scanner;

public class Chapter4_2_6 {
	public static void main(String[] args) {
		// 큐를 구현하는 클래스를 만들고 이를 구현하시오.
		//링 버퍼의 활용
		// front와 rear의 개념을 사용한다.
		// 제네릭 큐 클래스를 작성해서 String형의 배열을 형성해라.
		
			
			Scanner stdIn = new Scanner(System.in);
			Gqueue<String> q = new Gqueue<String>(64);
			
			while(true){
				System.out.println("현재 데이터 수 :"+ q.size() +" / " + q.capacity());
				System.out.println("메뉴를 선택하시오");
				System.out.print("(1)인큐  (2)디큐  (3)피크  (4)인덱스  (5)클리어  (6)큐비움여부  (7)큐풀여부 (8)덤프  (0)종료 ");
				int menu = stdIn.nextInt();
				if(menu == 0) break;
				
				String x;
				boolean t;
				switch(menu) {
				case 1:
					System.out.print("데이터:");
					x= stdIn.next();
					try {
						q.enque(x);
					}catch(Gqueue.OverflowGqueueException e) {
						System.out.println("큐가 가득 찾습니다.");
					}
					break;
				
				case 2:
					try {
						x= q.deque();
						System.out.println("디큐한 데이터는 " + x +"입니다.");
					}catch(Gqueue.EmptyGqueueException e) {
						System.out.println("큐가 비었습니다.");
					}
					break;
					
				case 3:try {
					x= q.peek();
					System.out.println("피크한 데이터는 " + x +"입니다.");
				}catch(Gqueue.EmptyGqueueException e) {
					System.out.println("큐가 비었습니다.");
				}
					break;
					
				case 4:
					System.out.println("찾고 싶은 데이터:");
					x= stdIn.next();
					int key = q.indexOf(x);
					if(key==-1) System.out.println("찾는 값이 없습니다.");
					else
						System.out.println("찾는 값은 que["+key+"]에 있습니다");
					break;
					
				case 5:
					System.out.println("큐를 클리어 합니다.");
					q.clear();
					break;
					
				case 6:
					t = q.isEmpty();
					if(t==true) System.out.println("큐가 비워져있습니다");
					else System.out.println("큐에 값이 있습니다.");
					break;
					
				case 7:
					t = q.isFull();
					if(t==true) System.out.println("큐가 꽉 찼습니다");
					else System.out.println("큐에 여유 공간이 있습니다.");
					break;
					
				case 8:
					q.dump();
					break;
		
					 
				
				}
			}
	}
}
