package chapter4;
import java.util.Scanner;
public class Chapter4_1_2 {



		public static void main(String[] args) {
			// GStack 제네릭클래스를 사용해 스택을 나타내는 프로그램을 작성하시오.
			// String 값을 받는 프로그램을 작성하시오.
			
			Scanner stdIn = new Scanner(System.in);
			GStack<String> s = new GStack<String>(64);
			
			while(true){
				System.out.println("현재 데이터 수 :"+ s.size() +" / " + s.capacity());
				System.out.println("메뉴를 선택하시오");
				System.out.print("(1)푸시  (2)팝  (3)피크  (4)인덱스  (5)클리어  (6)스텍비움여부  (7)스택풀여부 (8)덤프  (0)종료 ");
				int menu = stdIn.nextInt();
				if(menu == 0) break;
				
				 String x;
				boolean t;
				switch(menu) {
				case 1:
					System.out.print("데이터:");
					x= stdIn.next();
					try {
						s.push(x);
					}catch(IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찾습니다.");
					}
					break;
				
				case 2:
					try {
						x= s.pop();
						System.out.println("팝한 데이터는 " + x +"입니다.");
					}catch(IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비었습니다.");
					}
					break;
					
				case 3:try {
					x= s.peek();
					System.out.println("피크한 데이터는 " + x +"입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니다.");
				}
					break;
					
				case 4:
					System.out.println("찾고 싶은 데이터:");
					x= stdIn.next();
					int key = s.indexOf(x);
					if(key==-1) System.out.println("찾는 값이 없습니다.");
					else
						System.out.println("찾는 값은 stk["+key+"]에 있습니다");
					break;
					
				case 5:
					System.out.println("스택을 클리어 합니다.");
					s.clear();
					break;
					
				case 6:
					t = s.isEmpty();
					if(t==true) System.out.println("스택이 비워져있습니다");
					else System.out.println("스택에 값이 있습니다.");
					break;
					
				case 7:
					t = s.isFull();
					if(t==true) System.out.println("스택이 꽉 찼습니다");
					else System.out.println("스택에 여유 공간이 있습니다.");
					break;
					
				case 8:
					s.dump();
					break;
				
				}
			}
		}

	}

