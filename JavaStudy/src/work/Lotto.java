package work;

import java.util.ArrayList;
import java.util.HashSet;

public class Lotto {
	public static void main(String[] args) {
		
		HashSet<Integer> nums = new HashSet<>();
		while (nums.size() < 7) {
			nums.add((int)(Math.random() * 45 + 1));
		}
		
		ArrayList<Integer> lotto = new ArrayList<>(nums);
		System.out.println(lotto);
		
		int[] usr = new int[6];
		
		int index = 0;
		int cnt = 0;
		while (true) {
			cnt++;
		
		while (index < usr.length) {
			for (int i = 0; i < usr.length; ++i) {
				int num = (int)(Math.random() * 45 + 1);
				
				if (usr[i] == num) {
					break;
				} else {
					usr[i] = num;
					++index;
				}
			}
			
			int winCnt = 0;
			boolean bonus = false;
			for (int i = 0; i < usr.length; ++i) {
				for (int j = 0; j < lotto.size(); ++j) {
					if (usr[i] == lotto.get(i)) {
						++winCnt;
						
						if (j == 6) {
							bonus = true;
						}
						break;
						
					}
				}
			}
			
			if (winCnt == 6) {
				System.out.printf("[%2d, %2d, %2d, %2d, %2d, %2d, %2d] VS [%2d, %2d, %2d, %2d, %2d]\n",
						lotto.get(0), lotto.get(1), lotto.get(2), lotto.get(3), lotto.get(4), lotto.get(5), lotto.get(6),
						usr[0], usr[1], usr[2], usr[3], usr[4], usr[5]);
				
				System.out.print(cnt + "회 구매 안에");
				
				if (bonus) {
					System.out.println("2등 축하합니다!");
					break;
				} else {
					System.out.println("1등 축하합니다!");
					break;
				}
			}
			
		}
	}
	
		
	}
}
