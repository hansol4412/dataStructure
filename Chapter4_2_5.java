package chapter4;

import java.util.Scanner;

public class Chapter4_2_5 {

	public static void main(String[] args) {
		// 큐를 구현하는 클래스를 만들고 이를 구현하시오.
		//링 버퍼의 활용
		// front와 rear의 개념을 사용한다.
		
			
			Scanner stdIn = new Scanner(System.in);
			IntQueue q = new IntQueue(64);
			
			while(true){
				System.out.println("현재 데이터 수 :"+ q.size() +" / " + q.capacity());
				System.out.println("메뉴를 선택하시오");
				System.out.print("(1)인큐  (2)디큐  (3)피크  (4)인덱스  (5)클리어  (6)큐비움여부  (7)큐풀여부 (8)덤프  (9)서치 (0)종료 ");
				int menu = stdIn.nextInt();
				if(menu == 0) break;
				
				int x;
				boolean t;
				switch(menu) {
				case 1:
					System.out.print("데이터:");
					x= stdIn.nextInt();
					try {
						q.enque(x);
					}catch(IntQueue.OverflowIntQueueException e) {
						System.out.println("큐가 가득 찾습니다.");
					}
					break;
				
				case 2:
					try {
						x= q.deque();
						System.out.println("디큐한 데이터는 " + x +"입니다.");
					}catch(IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비었습니다.");
					}
					break;
					
				case 3:try {
					x= q.peek();
					System.out.println("피크한 데이터는 " + x +"입니다.");
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비었습니다.");
				}
					break;
					
				case 4:
					System.out.println("찾고 싶은 데이터:");
					x= stdIn.nextInt();
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
				
				case 9:
					System.out.println("찾고 싶은 데이터:");
					x= stdIn.nextInt();
					int queKey = q.search(x);
					if(queKey ==0) System.out.println("찾는 값이 없습니다.");
					else
						System.out.println("찾는 값은 큐의 "+queKey +"번째에 있습니다");
					break;
					 
					 
				
				}
			}
		}


	}


