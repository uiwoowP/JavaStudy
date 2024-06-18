package quiz;

import java.util.HashSet;

public class D02_LottoSet {
	/*
	 
	 	HashSet을 사용해 1 ~ 45 사이의 중복없는 7개의 랜덤 숫자를 생성해보세요
	 
	 */
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() < 7) {
			int ranNum = (int)(Math.random() * 45 + 1);
			lotto.add(ranNum);
		}
		
		
		
		
	}
	
}
