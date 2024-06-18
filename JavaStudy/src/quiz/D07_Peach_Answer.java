package quiz;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Peach implements Comparable<Peach> {
	
	int price;
	double weight;
	String grade;
	String farm_name;
	
	public Peach(int price, double weight, String grade, String farm_name) {
		this.price = price;
		this.weight = weight;
		this.grade = grade;
		this.farm_name = farm_name;
	}

	@Override
	public int compareTo(Peach p2) {
		if (this.weight == p2.weight) {
			return 0;
		} else if (this.weight < p2.weight) {
			return -1;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return String.format("{%d원/%.2fg/%s/%s}\n", price, weight, grade, farm_name);
	}
	
	
}

public class D07_Peach_Answer {
	public static void main(String[] args) {
		LinkedList<Peach> peaches = new LinkedList<>();
		
		peaches.add(new Peach(3000, 3.33, "B+", "김가네농장"));
		peaches.add(new Peach(2500, 2.44, "A+", "김씨네농장"));
		peaches.add(new Peach(1700, 4.21, "A-", "김씨부부네농장"));
		peaches.add(new Peach(3300, 6.33, "B", "김정묵씨네농장"));
		peaches.add(new Peach(2800, 4.55, "C", "김씨네농장"));
		peaches.add(new Peach(2800, 1.23, "B", "김씨네농장"));
		
		Collections.sort(peaches);
		System.out.println(peaches);
		
		System.out.println("#### 무게 기준 정렬(기본) ####");
		Collections.sort(peaches);
		System.out.println(peaches);
		
		System.out.println("#### 농장 이름순 오름차순, 등급 기준 내림차순 ####");
		Collections.sort(peaches, new Comparator<Peach>() {
			@Override
			public int compare(Peach p1, Peach p2) {
				String farm1 = p1.farm_name;
				String farm2 = p1.farm_name;
				
				if (farm1.equals(farm2)) {
					
				}
				
				return 0;
			}
		});
		
		System.out.println("#### 등급기준 내림차순, 가격기준 내림차순 ####");
		Collections.sort(peaches, new Comparator<Peach>() {
			@Override
			public int compare(Peach p1, Peach p2) {
				String grade1 = p1.grade;
				String grade2 = p2.grade;
				
				int len1 = grade1.length();
				int len2 = grade2.length();
				
				// Wrapper 클래스에도 각 타입의 크기를 비교할 수 있는 메서드가
				// 미리 구현되어 있다
				if (grade1.equals(grade2)) {
					//return Integer.compare(p2.price, p1.price);
					return p2.price - p1.price;
				}
				
				// 등급의 길이가 모두 1이거나 2라면 사전순으로 처리할 수 있다
				// 사전순으로 정렬하는 기능은 String 클래스에 이미 정의되어 있다
				if (len1 == 2 && len2 ==2 || len1 == 1 && len2 ==1) {
					return grade1.compareTo(grade2);
				}
				
				// 두 문자열의 길이가 다른 경우
				
				// 앞의 문자를 비교
				char ch1 = grade1.charAt(0);
				char ch2 = grade2.charAt(0);
				
				if (ch1 != ch2) {
					return Character.compare(ch1, ch2);
				}
				
				// 앞의 두 문자가 같은 경우 +, -를 통해 순서 정리
				if (grade1.contains("-")) {
					return 1;
				} else if (grade2.contains("-")) {
					return -1;
				} else if (grade1.contains("+")) {
					return -1;
				} else {
					return 1;
				}

			}
		});
		System.out.println(peaches);
	}

}
