package chapter1;

public class Chapter1_2_14 {

	public static void main(String[] args) {
		// ǥ�� ������ ���缭 ����ǥ�� ����Ͻÿ�
		
		System.out.print("  ");
		for(int n=1; n<=9; n++) {
		System.out.printf("%3d",n);
		}
		System.out.println();
		System.out.println("-+---------------------------");
		
		
		for(int i = 1; i<=9; i++) {
			System.out.print(i+"|");
			for(int j=1; j<=9; j++) {
				
			System.out.printf("%3d",i*j);
		}
			System.out.println();
	}

}
}
