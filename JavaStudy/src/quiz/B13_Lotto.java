package quiz;
import java.util.Arrays;

public class B13_Lotto {
	
	/*
	 
	 	(1) 1 ~ 45 사이의 중복 없는 랜덤 숫자 7개를 생성하여 로또 당첨 번호를 만들어 보세요
	 	
	 	1. 숫자를 랜덤으로 뽑는다
	 	2. 뽑았으면 이전에 뽑았던 숫자중에 방금 뽑은 숫자가 없는지 확인한다
	 	3. 있으면 다시뽑고 없으면 넘어간다
	 	
	 	(2) 1등 또는 2등에 당첨될때까지 랜덤 로또 번호를 계속 생성하여
	 		몇 번 만에 당첨되었는지 출력해 보세요.
	 		
	 		- 로또 구매자는 번호를 6개 고른다
	 		- 보너스 번호를 제외하고 모두 맞추면 1등
	 		- 보너스 번호를 포함하여 모두 맞추면 2등
	 */
	
	public static void main(String[] args) {
		
		int index = 0;
		int[] lotto = new int[7];
		
		while (index < lotto.length) {
			int num = (int)(Math.random() * 45 + 1);
			
			boolean repeated = false;
			for (int i = 0; i < index; ++i) {
				if (lotto[i] == num) {
					
					repeated = true;
					break;
				}
			}
			
			if (!repeated) {
				lotto[index] = num;
				++index;
			}
			
		}

		int cnt = 0;
		
		while (true) {
			++cnt;
			
			int[] usr = new int[6];
			index = 0;
			while (index < usr.length) {
				int num = (int)(Math.random() * 45 + 1);
				boolean isRepeat = false;
				
				for (int i = 0; i < usr.length; ++i) {
					if(usr[i] == num) {
						isRepeat = true;
						break;
					}
				}
				
				if (!isRepeat) {
					usr[index] = num;
					++index;
				}
			}
			
			int winCount = 0;
			boolean hasBonus = false;
			for (int i = 0; i < usr.length; i++) {
				for (int j = 0; j < lotto.length; j++) {
					if (usr[i] == lotto[i]) {
						++winCount;
						if (j == 6) {
							hasBonus = true;
						}
						break;
					}
				}
			}
			
			if (winCount == 6) {
				System.out.printf("[%2d, %2d, %2d, %2d, %2d,  %2d, %2d] VS [%2d, %2d, %2d, %2d, %2d, %2d]\n",
						lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5], lotto[6],
						usr[0], usr[1], usr[2], usr[3], usr[4], usr[5]);
				System.out.print(cnt + "회 구매안에");
				
				if (hasBonus) {
					System.out.println("2등 ㅊㅋㅊㅋ!!");
					break;
				} else {
					System.out.println("1등 ㅊㅋㅊㅋ!!");
					break;
				}
			}
			
		}
		
		
		
		
		
		
	}
}


