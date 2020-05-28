package chapter6;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Chapter6_7_16 {
	static class PhysData{
		String name; 
		int height;
		double vision;
	
	PhysData(String name, int height, double vision){
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	static final Comparator<PhysData> VISION_DEORDER = new VisionDeorderComparator();
	private static class VisionDeorderComparator implements Comparator<PhysData>{
		public int compare(PhysData d1, PhysData d2) {
			return (d1.vision<d2.vision) ? 1: (d1.vision>d2.vision)?-1:0;
		}
		
	}
	}

	public static void main(String[] args) {
		// �迭 x�� �÷��� ������������ �����Ͻÿ�.
		PhysData[] x = {
				new PhysData("�̳���", 162, 0.3),
				new PhysData("������", 173, 0.7),
				new PhysData("�̼���", 175, 2.0),
				new PhysData("ȫ�ر�", 171, 1.5),
				new PhysData("������", 168, 0.4),
				new PhysData("��ȣ��", 174, 1.2),
				new PhysData("���Ѱ�", 169, 0.8),
		};
		Arrays.sort(x, PhysData.VISION_DEORDER);
		
		System.out.println("��ü �˻� ����Ʈ");
		System.out.println("�̸�        Ű      �÷�");
		System.out.println("-------------------");
		for(int i = 0; i<x.length; i++)
			System.out.printf("%-8s%3d%5.1f \n",x[i].name, x[i].height, x[i].vision);
	}

}
