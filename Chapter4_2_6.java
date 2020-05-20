package chapter4;

import java.util.Scanner;

public class Chapter4_2_6 {
	public static void main(String[] args) {
		// ť�� �����ϴ� Ŭ������ ����� �̸� �����Ͻÿ�.
		//�� ������ Ȱ��
		// front�� rear�� ������ ����Ѵ�.
		// ���׸� ť Ŭ������ �ۼ��ؼ� String���� �迭�� �����ض�.
		
			
			Scanner stdIn = new Scanner(System.in);
			Gqueue<String> q = new Gqueue<String>(64);
			
			while(true){
				System.out.println("���� ������ �� :"+ q.size() +" / " + q.capacity());
				System.out.println("�޴��� �����Ͻÿ�");
				System.out.print("(1)��ť  (2)��ť  (3)��ũ  (4)�ε���  (5)Ŭ����  (6)ť��򿩺�  (7)ťǮ���� (8)����  (0)���� ");
				int menu = stdIn.nextInt();
				if(menu == 0) break;
				
				String x;
				boolean t;
				switch(menu) {
				case 1:
					System.out.print("������:");
					x= stdIn.next();
					try {
						q.enque(x);
					}catch(Gqueue.OverflowGqueueException e) {
						System.out.println("ť�� ���� ã���ϴ�.");
					}
					break;
				
				case 2:
					try {
						x= q.deque();
						System.out.println("��ť�� �����ʹ� " + x +"�Դϴ�.");
					}catch(Gqueue.EmptyGqueueException e) {
						System.out.println("ť�� ������ϴ�.");
					}
					break;
					
				case 3:try {
					x= q.peek();
					System.out.println("��ũ�� �����ʹ� " + x +"�Դϴ�.");
				}catch(Gqueue.EmptyGqueueException e) {
					System.out.println("ť�� ������ϴ�.");
				}
					break;
					
				case 4:
					System.out.println("ã�� ���� ������:");
					x= stdIn.next();
					int key = q.indexOf(x);
					if(key==-1) System.out.println("ã�� ���� �����ϴ�.");
					else
						System.out.println("ã�� ���� que["+key+"]�� �ֽ��ϴ�");
					break;
					
				case 5:
					System.out.println("ť�� Ŭ���� �մϴ�.");
					q.clear();
					break;
					
				case 6:
					t = q.isEmpty();
					if(t==true) System.out.println("ť�� ������ֽ��ϴ�");
					else System.out.println("ť�� ���� �ֽ��ϴ�.");
					break;
					
				case 7:
					t = q.isFull();
					if(t==true) System.out.println("ť�� �� á���ϴ�");
					else System.out.println("ť�� ���� ������ �ֽ��ϴ�.");
					break;
					
				case 8:
					q.dump();
					break;
		
					 
				
				}
			}
	}
}
