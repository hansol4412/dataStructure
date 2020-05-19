package chapter4;

import java.util.Scanner;

public class Chapter4_1_3 {
	public enum AorB {
		StackA, StackB 
	}
	public static void main(String[] args) {
		// �ϳ��� �迭�� �����Ͽ� 2���� ������ �����ϴ� int�� �����Ϳ� ����Ŭ������ ���弼��
		// ���ÿ� �����ϴ� �����ʹ� int�� ������ �迭�� ó���� ���� ����ϼ���.

		Scanner stdIn = new Scanner(System.in);
		XIntStack s = new XIntStack(6);
		
	
	
		while(true){
			
			System.out.println("�޴��� �����Ͻÿ�");
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ  (4)�ε���  (5)Ŭ����  (6)���غ�򿩺�  (7)����Ǯ���� (8)����  (0)���� ");
			int menu = stdIn.nextInt();
			System.out.print("Stack1: 10     Stack2: 20    =>");
			int sw = stdIn.nextInt();
			//System.out.println("���� ������ �� :"+ s.size(sw) +" / " + s.capacity());
			if(menu == 0) break;
			
			int x;
			boolean t;
			switch(menu) {
			case 1:
				System.out.print("������:");
				x= stdIn.nextInt();
				try {
					s.push(sw,x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� ã���ϴ�.");
				}
				break;
			
			case 2:
				try {
					x= s.pop(sw);
					System.out.println("���� �����ʹ� " + x +"�Դϴ�.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ������ϴ�.");
				}
				break;
				
			case 3:try {
				x= s.peek(sw);
				System.out.println("��ũ�� �����ʹ� " + x +"�Դϴ�.");
			}catch(IntStack.EmptyIntStackException e) {
				System.out.println("������ ������ϴ�.");
			}
				break;
				
			case 4:
				System.out.println("ã�� ���� ������:");
				x= stdIn.nextInt();
				int key = s.indexOf(sw,x);
				if(key==-1) System.out.println("ã�� ���� �����ϴ�.");
				else
					System.out.println("ã�� ���� stk["+key+"]�� �ֽ��ϴ�");
				break;
				
			case 5:
				System.out.println("������ Ŭ���� �մϴ�.");
				s.clear(sw);
				break;
				
			case 6:
				t = s.isEmpty(sw);
				if(t==true) System.out.println("������ ������ֽ��ϴ�");
				else System.out.println("���ÿ� ���� �ֽ��ϴ�.");
				break;
				
			case 7:
				t = s.isFull();
				if(t==true) System.out.println("������ �� á���ϴ�");
				else System.out.println("���ÿ� ���� ������ �ֽ��ϴ�.");
				break;
				
			case 8:
				s.dump(sw);
				break;
			
			}
		}
	}

}