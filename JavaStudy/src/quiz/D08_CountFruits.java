package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D08_CountFruits {
	
	// 크기 1000의 String[]을 만들고 다음의 과일들을 무작위로 추가해보세요
	// 각 과일이 몇 개씩 들어있는지 세어서 출력해주세요
	
	final public static String[] FRUITS = 
		{ "Apple", "Banana", "Orange", "Mango", "Kiwi", "Pineapple"
				, "Peach", "Watermelon", "Grape" };
	
	public static void main(String[] args) {
		
		// 1.
		ArrayList<String> fruits = new ArrayList<String>();
		
		for (int i = 0; i < 1000; ++i) {
			int ran = (int)(Math.random() * FRUITS.length);
			fruits.add(FRUITS[ran]);
		}

		System.out.println(fruits);
		
		
		// 2.
		for (int i = 0; i < FRUITS.length; ++i) {
			System.out.printf("%s 의 수 : %d \n", FRUITS[i], Collections.frequency(fruits, FRUITS[i]));
		}
	}
}
