package chapter5;

public class Chapter5_3_8 {
	static boolean[] flagA = new boolean[8];
	static boolean[] flagB = new boolean[15];
	static boolean[] flagC = new boolean[15];
	static int[] pos = new int[8];
	
	static void print()
	{
		for(int i =0; i<8; i++)
			for (int j = 0; j < 8; j++)
			System.out.printf("%s", j == pos[i] ? "¡á" : "¡à");
		System.out.println();
	}
	static void set(int i) {
		for(int j = 0; j<8; j++){
			if(flagA[j] == false && flagB[i+j]==false && flagC[i-j+7]==false) {
				pos[i]=j;
				if(i==7) print();
				else {
					flagA[j]=flagB[i+j]=flagC[i-j+7]=true;
					set(i+1);
					flagA[j]=flagB[i+j]=flagC[i-j+7]=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		// 8Äö
		set(0);

	}

}
