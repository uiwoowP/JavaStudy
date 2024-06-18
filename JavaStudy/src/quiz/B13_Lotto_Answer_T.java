package quiz;

public class B13_Lotto_Answer_T {
	
	public static void main(String[] args) {
		
		int[] winNums = new int[7];
		int currIndex = 0;
		
		while (currIndex < 7) {
			int num = (int)(Math.random() * 45 + 1);
			
			boolean repeated = false;
			for (int i = 0; i < currIndex; ++i) {
				if (winNums[i] == num) {
					
					repeated = true;
					break;
				}
			}
			
			if (!repeated) {
				winNums[currIndex] =num;
				++currIndex;
			}
		}
		
		int buyCount = 0;
		
		while (true) {
			++buyCount;
			
			int[] userNums = new int[6];
			currIndex = 0;
			while (currIndex < userNums.length) {
				int num = (int)(Math.random() * 45 + 1);
				boolean repeated = false;
				for (int i = 0; i < currIndex; ++i) {
					if (userNums[i] == num) {
						repeated = true;
						break;
					}
				}
				
				if (!repeated) {
					userNums[currIndex] = num;
					++currIndex;
				}
			}
			
			int winCount = 0;
			boolean hasBonus = false;
			for (int i = 0; i < userNums.length; ++i) {
				for (int j = 0; j < winNums.length; ++j) {
					if (userNums[i] == winNums[j]) {
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
						winNums[0], winNums[1], winNums[2], winNums[3], winNums[4], winNums[5], winNums[6],
						userNums[0], userNums[1], userNums[2], userNums[3], userNums[4], userNums[5]);
				
				System.out.print(buyCount + "회 구매안에");
				
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
