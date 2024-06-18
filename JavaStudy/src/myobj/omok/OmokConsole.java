package myobj.omok;

import java.util.Scanner;

public class OmokConsole {
	/*
	 
	 대각선 (1, 2), (2, 3), (3, 4), (4, 5), (5, 6)
	 세로 (1, 2), (2, 2), (3, 2), (4, 2), (5, 2)
	 가로 (1, 2), (1, 3), (1, 4), (1, 5), (1, 6)
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		Scanner sc = new Scanner(System.in);
		
		Omok omok = new Omok();
		
		
		while (true) {
			System.out.println("#### 오목 ####");
			System.out.println("돌 색을 선택해 주세요 1.● 2.○");
			p1.setNum(sc.nextInt());
			p1.setStone();
			System.out.println("선택한 돌 색은 " + p1.stone + "입니다.");
			
			if (p1.stone == '●') {
				p2.stone = '○';
			} else {
				p2.stone = '●';
			}
			
			boolean gameOver = false;
			int cnt = 0;
			int turn = 0;
			while (!gameOver) {
				
				while (turn == 0) { 
					System.out.println("1번 플레이어님 위치를 입력해 주세요");
					int p1x = sc.nextInt();
					int p1y = sc.nextInt();
					
					if (p1x > omok.board.length || p1x < 0) {
						System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
						System.out.println("범위에 맞는 숫자를 다시 입력해 주세요");
						System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
						continue;
					} else if (p1y > omok.board[0].length || p1y < 0) {
						System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
						System.out.println("범위에 맞는 숫자를 다시 입력해 주세요");
						System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
						continue;
					} else if (omok.board[p1x][p1y] == p1.stone || omok.board[p1x][p1y] == p2.stone) {
						System.out.println("이미 돌이 놓여있는 자리입니다.");
						continue;
					} else {
						omok.update(p1x, p1y, p1.stone);
						omok.draw();
						if (omok.isWin(p1x, p1y, p1.stone)) {
							System.out.println("1번 플레이어님 승리하셨습니다.");
							gameOver = true;
							break;
						}
						turn = 1;
					}
				}
				
				
				
				while (turn == 1) {
					System.out.println("2번 플레이어님 위치를 입력해 주세요");
					
					int p2x = sc.nextInt();
					int p2y = sc.nextInt();
					
					if (p2x > omok.board.length || p2x < 0) {
						System.out.println("범위에 맞는 숫자를 다시 입력해 주세요");
						continue;
					} else if (p2y > omok.board[0].length || p2y < 0) {
						System.out.println("범위에 맞는 숫자를 다시 입력해 주세요");
						continue;
					} else if (omok.board[p2x][p2y] == p1.stone || omok.board[p2x][p2y] == p2.stone) {
						System.out.println("이미 돌이 놓여있는 자리입니다.");
						continue;
					} else {
						omok.update(p2x, p2y, p2.stone);
						omok.draw();
						if (omok.isWin(p2x, p2y, p2.stone)) {
							System.out.println("2번 플레이어님 승리하셨습니다.");
							gameOver = true;
							break;
						}
						turn = 0;
					}
					
				}

			}
		}
		
	}

}
