package pirategame;

import java.util.Arrays;
import java.util.Scanner;

public class PirateGame {
	int[] hole = new int [20];
	Player[] players = new Player[4];
	boolean isPoped = false;

	public PirateGame() {
		hole = genTarget();
		players = genPlayers();
	}

	private int[] genTarget() {
		for (int i = 0; i < 4; ++i) {
			int ranNum = (int)(Math.random() * hole.length);
			if (hole[ranNum] == -1) {
				--i;
			} else {
				hole[ranNum] = -1;
			}
		}
		return hole;
	}
	
	private Player[] genPlayers() {
		for (int i = 0; i < players.length; ++i) {
			players[i] = new Player(i);
		}
		return players;
	}
	
	public void pop() {
		System.out.println("@@@@!통아저씨가 발사되었습니다!@@@@ \n");
		isPoped = true;
	}
	
	public void shoot(int num) {
		if (hole[num] == -1) {
			pop();
		} else {
			hole[num] = 1;
		}
	}
	
	public void showScore() {
		for (int i = 0; i < players.length; ++i) {
			System.out.printf("%d번 플레이어님 점수: %d, 돈: %d \n",
					players[i].playerNum + 1, players[i].score, players[i].money);
		}
	}
	
	public void sortRank() {
		Arrays.sort(players, (p1, p2) -> {
			return Integer.compare((p1.score), (p2.score));
		});
		
		for (int i = 0; i < players.length; ++i) {
			System.out.printf("현재 %d 등 %d번 플레이어님 \n",
					i + 1, players[i].playerNum + 1);
		}
		
		System.out.println("=================================================");
		System.out.println("===================상금정산========================");
		System.out.println("=================================================");
		
		players[0].money += 1000;
		players[1].money += 500;
		players[2].money -= 500;
		players[3].money -= 1000;
		
		for (int i = 0; i < players.length; ++i) {
			System.out.printf("상금 정산후 %d 번 플레이어님 잔액 %d \n",
					players[i].playerNum + 1, players[i].money);
		}
	}
	
	public static void main(String[] args) {
		boolean DEBUG_MODE = true;
		Scanner sc = new Scanner(System.in);
		boolean gameOver = false;
		
		System.out.println("해적 게임을 시작합니다");
		PirateGame game = new PirateGame();
		
		while (!gameOver) {
			
			game.showScore();
			game.genTarget();
			
			for (int i = 0; i < game.players.length; ++i) {
				if (game.players[i].money < 0) {
					gameOver = true;
				}
			}
			
			if (DEBUG_MODE) {
				System.out.println(Arrays.toString(game.hole));
			}			
			
			for (int i = 0; i < game.players.length; ++i) {
				System.out.printf("%d 번째 플레이어 님 차례입니다.\n", i + 1);
				System.out.println("숫자를 입력해 주세요");
				int shot = sc.nextInt();
				game.shoot(shot);
				game.players[i].tryingCnt += 1;
				game.players[i].calcScore();
				game.players[i].playerInfo();
						
				if (game.isPoped) {
					game.players[i].calcScore();
					game.players[i].score -= 200;
					System.out.println("라운드가 끝났습니다.");
					game.showScore();
					break;
				}
			}
			
			System.out.println("========================");
			System.out.println("현재 순위는 아래와 같습니다.");
			game.sortRank();
			
		}
		
	}

}
