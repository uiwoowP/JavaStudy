package baseballgame;

import java.io.IOException;
import java.util.Scanner;

public class BaseballGame {
	String answer;
	static int maxChance = 9;
	
	public BaseballGame() {
		answer = genAnswer();
	}
	
	public String genAnswer() {
		answer = String.format("%04d", (int)(Math.random() * 10000));
		return answer;
	}
	
	public void throwBall() {

		int chance = maxChance;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("숫자를 입력해 주세요");
			String word = sc.nextLine();
			
			if (word.length() != 4) {
				System.out.println("4자리 숫자를 입력해 주세요.");
				continue;
			}
			
			int strCnt = 0;
			int ballCnt = 0;

			for (int i = 0; i < word.length(); ++i) {
				if (word.charAt(i) == answer.charAt(i)) {
					strCnt++;
				} else if (answer.contains(String.valueOf(word.charAt(i)))) {
					ballCnt++;
				}
			}
			
			System.out.printf("%d Strike ! %d Ball ! \n", strCnt, ballCnt);
			
			if (strCnt == 4) {
				System.out.println("승리! 축하합니다!");
				break;
			}
			
			if (chance == 0) {
				System.out.println("아쉽게도 기회를 모두 사용했습니다! ");
				break;
			} else if (chance != 0) {
				System.out.printf("남은 기회는 %d 번 입니다 \n", chance);
			}
			chance--;
			strCnt = 0;
		}
		sc.close();
	}
	
	public static void main(String[] args) throws IOException {
		boolean DEBUG = true;
		
		BaseballGame b1 = new BaseballGame();
		
		if (DEBUG) { System.out.println(b1.answer); }
		
		b1.throwBall();
	}
}
