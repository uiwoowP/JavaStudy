package quiz;

import java.util.Scanner;

public class B12_UpdownGame {
	
	/*

	 	# Updown 게임을 만들어 보세요
	 	
	 	1. 게임이 시작되면 1 ~ 100 사이의 랜덤 숫자가 정답이 된다
	 	
	 	2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다
	 	
	 	3. 만약 사용자가 현재 추측 범위를 벗어나는 숫자를 입력했다면
	 	   기회를 소진하지 않고 다시 입력할 수 있는 기회를 준다
	 	   
	 	   ex> 50
	 	       Down!
	 	       75
	 	       추측 범위를 벗어난 숫자입니다... 기회는 소진되지 않습니다 (남은기회 4회)
	 	
	 	4. 6번 안에 못맞추면 정답이 뭐였는지 알려주고 프로그램을 종료한다
	 	
	 	5. 사용자가 정답을 맞추면 축하한다고 해주고 프로그램을 종료한다
	 
	 */
	
	public static void main(String[] args) {
		
		int answer = (int)((Math.random() * 100) + 1);
		int usrTry = 0;
		int USER_MAX_TRY = 6;
		int minNum = 101;
		int maxNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			if (usrTry == USER_MAX_TRY) {
				System.out.printf("모든 기회를 사용하셨습니다."
						+ "정답은 %d이었습니다", answer);
				break;
			}
			
			System.out.println("추측한 숫자를 입력해 주세요> ");
			int guess = sc.nextInt();
			
			if (guess >= maxNum || guess <= minNum) {
				System.out.printf("추측 범위를 벗어난 숫자입니다"
						+ "현재 추측 범위는 %d초과 %d 미만입니다", maxNum, minNum);
				continue;
			}
			
			++usrTry;
			
			if (guess == answer) {
				System.out.println(usrTry + "회 만에 정답입니다. 축하합니다.");
				break;
			} else if (guess < answer) {
				System.out.printf("UP! (남은기회: %d)\n", USER_MAX_TRY - usrTry);
				minNum = guess;
			} else if (guess > answer) {
				System.out.printf("DOWN! (남은기회: %d\n", USER_MAX_TRY - usrTry);
				maxNum = guess;
			}
	
		}

		
	}
	
}
