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
		// 난수를 이용해 학생수와 점수를 입력받고 점수의 최댓값을 구하시오.
		Random rand = new Random();
		
		System.out.print("사람 수는 ");

		int num= 1+ rand.nextInt(10);
		
		System.out.println(num+"입니다.");
		
		int height[] = new int[num];
		
		for(int i =0 ; i<height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"]:"+ height[i]);
		}
		
		System.out.println("최댓값은 "+ max(height) +"입니다.");
	}

}
