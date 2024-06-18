package myobj.peach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeachTest {
	public static void main(String[] args) {
		
		List<Peach> peaches = new ArrayList<>();
		
		Peach p1 = new Peach(3500, "B", 3, "그냥농원");
		Peach p2 = new Peach(5000, "A+", 5, "조은농원");
		Peach p3 = new Peach(2500, "B-", 2, "어쩌다농원");
		Peach p4 = new Peach(1500, "C", 1, "노오력농원");
		Peach p5 = new Peach(4300, "B+", 4, "대박농원");
		Peach p6 = new Peach(4000, "B+", 3, "같은등급농원");
		Peach p7 = new Peach(3900, "B+", 2, "동일한등급농원");
		Peach p8 = new Peach(3900, "A+", 2, "대박농원");
		
		Collections.addAll(peaches, p1, p2, p3, p4, p5, p6, p7, p8);
		// 무게 기준
		Collections.sort(peaches);
		
		System.out.println(peaches);
		
		System.out.println("=======등급기준=======");
		// 등급기준 내림차순 정렬
		// 등급이 같은 경우 가격 기준으로 내림차순 정렬
		Collections.sort(peaches, new Comparator<Peach>() {
			@Override
			public int compare(Peach p1, Peach p2) {
				
				if(p1.grade == p2.grade) {
					return p1.price - p2.price;
				}
				p1.assignNum(p1.grade);
				p2.assignNum(p2.grade);

				
				return p1.numGrade - p2.numGrade;
			}
		});
		
		System.out.println(peaches);
		
		// 농장이름으로 오름차순 정렬
		// 농장이름이 같은경우 등급 기준으로 내림차순 정렬
		
		Collections.sort(peaches, new Comparator<Peach>() {
			@Override
			public int compare(Peach p1, Peach p2) {
				if (p1.farm == p2.farm) {
					return p1.weight - p2.weight;
				}
				return String.valueOf(p1.farm).compareTo(p2.farm) * 1;
			}
		});;
		
		System.out.println(peaches);
		
	}

}
