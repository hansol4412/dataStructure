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
		// 배열 x를 시력의 내림차순으로 정렬하시오.
		PhysData[] x = {
				new PhysData("이나령", 162, 0.3),
				new PhysData("전서현", 173, 0.7),
				new PhysData("이수민", 175, 2.0),
				new PhysData("홍준기", 171, 1.5),
				new PhysData("유지훈", 168, 0.4),
				new PhysData("이호연", 174, 1.2),
				new PhysData("김한결", 169, 0.8),
		};
		Arrays.sort(x, PhysData.VISION_DEORDER);
		
		System.out.println("신체 검사 리스트");
		System.out.println("이름        키      시력");
		System.out.println("-------------------");
		for(int i = 0; i<x.length; i++)
			System.out.printf("%-8s%3d%5.1f \n",x[i].name, x[i].height, x[i].vision);
	}

}
