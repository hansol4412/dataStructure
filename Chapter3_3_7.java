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
		// 시력에 대한 내림차순 정렬의 신체검사 데이터에서 특정 시력을 가진 사람을 검색하는 프로그램을 작성하시오.
		Scanner stdIn = new Scanner(System.in);
		PyscData[] a = {
				// 배열의 요소는 시력순이지 않으면 안됩니다.
				new PyscData("이나령", 162, 0.3),
				new PyscData("유지훈", 168, 0.4),
				new PyscData("전서현", 173, 0.7),
				new PyscData("김한결", 169, 0.8),
				new PyscData("이호연", 174, 1.2),
				new PyscData("홍운기", 171, 1.5),
				new PyscData("이수민", 175, 2.0),
		};
		System.out.print("시력이 몇 인 사람을 찾고 있나요?:");
		double vision = stdIn.nextDouble();
		int idx = Arrays.binarySearch(a, new PyscData("", 0, vision) ,
				PyscData.VISION_ORDER);
		
		if(idx<0)System.out.println("찾는 요소가 없습니다");
		else {
			System.out.println("찾는 데이터는 a["+idx+"]에 있습니다.");
			System.out.println("찾는 데이터:"+a[idx]);
		}

	}

}
