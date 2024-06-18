package quiz;

import java.util.ArrayList;

public class D01_ArrayListQuiz_Answer {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//1
		for (int i = 0; i < 100; ++i) {
			numbers.add((int)(Math.random() * 1000 + 1000));
		}
		
		System.out.println(numbers);
		//2
		int i = 0;
		while (i < numbers.size()) {
			if (numbers.get(i) % 2 == 0) {
				numbers.remove(i);
				continue;
			} else {
				++i;
			}
		}
		
		System.out.println(numbers);
		System.out.println("남은 개수: " + numbers.size());
		
		//3
		
		i = 0;
		while (i < numbers.size()) {
			if (numbers.get(i) % 2 == 1) {
				numbers.remove(i);
				continue;
			} else {
				++i;
			}
		}
		
		System.out.println(numbers);
		System.out.println("남은 개수: " + numbers.size());
		
		
		// 리스트를 활용해 짝수 리스트와 홀수 리스트를 만들어 처리하기
		ArrayList<Integer> origin = new ArrayList<>();
		
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();
		
		for (i = 0; i < 100; ++i) {
			origin.add((int)(Math.random() * 1000 + 1000));
		}
		
		int len = origin.size();
		for (i = 0; i < len; ++i) {
			int value;
			switch ((value = origin.get(i)) % 2) {
			case 0:
				evenList.add(value);
				break;
			case 1:
				oddList.add(value);
				break;
			}
		}
		System.out.println(origin);
		System.out.println(evenList.size());
		System.out.println(oddList.size());
		
	}

}
