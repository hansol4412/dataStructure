package chapter2;
import java.util.Random;

public class Chapter2_1_1 {
	static int max(int[] height) {
		int max = height[0];
		
		for(int i=1; i< height.length; i++) 
			if(max<height[i])
				max = height[i];
		return max;
	}

	public static void main(String[] args) {
		// ������ �̿��� �л����� ������ �Է¹ް� ������ �ִ��� ���Ͻÿ�.
		Random rand = new Random();
		
		System.out.print("��� ���� ");

		int num= 1+ rand.nextInt(10);
		
		System.out.println(num+"�Դϴ�.");
		
		int height[] = new int[num];
		
		for(int i =0 ; i<height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"]:"+ height[i]);
		}
		
		System.out.println("�ִ��� "+ max(height) +"�Դϴ�.");
	}

}
