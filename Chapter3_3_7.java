package chapter3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Chapter3_3_7 {
	static class PyscData{
		private String name;
		private int height;
		private double vision;
		
		PyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		public static final Comparator<PyscData> VISION_ORDER = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PyscData>{
			public int compare(PyscData d1, PyscData d2) {
				return (d1.vision > d2.vision)? 1 :
					(d1.vision < d2.vision)? -1: 0;
			}
		}
	}
	public static void main(String[] args) {
		// �÷¿� ���� �������� ������ ��ü�˻� �����Ϳ��� Ư�� �÷��� ���� ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		PyscData[] a = {
				// �迭�� ��Ҵ� �÷¼����� ������ �ȵ˴ϴ�.
				new PyscData("�̳���", 162, 0.3),
				new PyscData("������", 168, 0.4),
				new PyscData("������", 173, 0.7),
				new PyscData("���Ѱ�", 169, 0.8),
				new PyscData("��ȣ��", 174, 1.2),
				new PyscData("ȫ���", 171, 1.5),
				new PyscData("�̼���", 175, 2.0),
		};
		System.out.print("�÷��� �� �� ����� ã�� �ֳ���?:");
		double vision = stdIn.nextDouble();
		int idx = Arrays.binarySearch(a, new PyscData("", 0, vision) ,
				PyscData.VISION_ORDER);
		
		if(idx<0)System.out.println("ã�� ��Ұ� �����ϴ�");
		else {
			System.out.println("ã�� �����ʹ� a["+idx+"]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������:"+a[idx]);
		}

	}

}
