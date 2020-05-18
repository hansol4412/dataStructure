package chapter4;
import java.util.Scanner;

public class Chapter4_1_1 {

	public static void main(String[] args) {
		// IntStack Ŭ������ ����� ������ ��Ÿ���� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true){
			System.out.println("���� ������ �� :"+ s.size() +" / " + s.capacity());
			System.out.println("�޴��� �����Ͻÿ�");
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ  (4)�ε���  (5)Ŭ����  (6)���غ�򿩺�  (7)����Ǯ���� (8)����  (0)���� ");
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			int x;
			boolean t;
			switch(menu) {
			case 1:
				System.out.print("������:");
				x= stdIn.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� ã���ϴ�.");
				}
				break;
			
			case 2:
				try {
					x= s.pop();
					System.out.println("���� �����ʹ� " + x +"�Դϴ�.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ������ϴ�.");
				}
				break;
				
			case 3:try {
				x= s.peek();
				System.out.println("��ũ�� �����ʹ� " + x +"�Դϴ�.");
			}catch(IntStack.EmptyIntStackException e) {
				System.out.println("������ ������ϴ�.");
			}
				break;
				
			case 4:
				System.out.println("ã�� ���� ������:");
				x= stdIn.nextInt();
				int key = s.indexOf(x);
				if(key==-1) System.out.println("ã�� ���� �����ϴ�.");
				else
					System.out.println("ã�� ���� stk["+key+"]�� �ֽ��ϴ�");
				break;
				
			case 5:
				System.out.println("������ Ŭ���� �մϴ�.");
				s.clear();
				break;
				
			case 6:
				t = s.isEmpty();
				if(t==true) System.out.println("������ ������ֽ��ϴ�");
				else System.out.println("���ÿ� ���� �ֽ��ϴ�.");
				break;
				
			case 7:
				t = s.isFull();
				if(t==true) System.out.println("������ �� á���ϴ�");
				else System.out.println("���ÿ� ���� ������ �ֽ��ϴ�.");
				break;
				
			case 8:
				s.dump();
				break;
			
			}
		}
	}

}
