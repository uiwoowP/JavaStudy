package quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class D01_ArrayListQuiz {
	
	/*
	 
	 	1. 리스트에 1000 ~ 1999 사이의 랜덤 정수를 100개 추가하기
	 	
	 	2. 원본에서 짝수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	 	
	 	3. 원본에서 홀수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	 
	 */
	public static void main(String[] args) {
		
		// 1.
		ArrayList<Integer> list = new ArrayList<>();
		
		
		for (int i = 0; i < 100; ++i) {
			int ranNum = (int)((Math.random() * 1000) + 1000);
			list.add(ranNum);
		}
		System.out.println(list);
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		
		// 2.
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); ++i) {
			if ((int)list.get(i) % 2 == 0) {
				list2.add(list.get(i));
			}
		}
		list.removeAll(list2);
		System.out.println(list);
		System.out.println();
		System.out.println("짝수를 제거하고 남은 값의 수는 [" + list.size() + "] 입니다.");
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		
		// 3.
		ArrayList<Integer> list3 = new ArrayList<>();
		for (int i = 0; i < list.size(); ++i) {
			if ((int)list.get(i) % 2 != 0) {
				list3.add(list.get(i));
			}
		}
		list.removeAll(list3);
		System.out.println(list3);
		System.out.println();
		System.out.println("홀수를 제거하고 남은 값의 수는 [" + list.size() + "]입니다.");
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
	
		
	}
}
