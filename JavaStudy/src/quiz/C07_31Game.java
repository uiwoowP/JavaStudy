package quiz;

import java.util.Scanner;

class Game_31 {
	int numPlayer;
	int targetNum;
	int currTotal;
	Player[] players;
	
	Scanner sc = new Scanner(System.in);
	
	public Game_31() {
		setGame();
		this.players = new Player[numPlayer];
		genPlayer();
	}
	
	private void setGame() {
		
		System.out.println("참가하는 총 인원을 입력해 주세요 >");
		this.numPlayer = sc.nextInt();
		System.out.println("마지막 숫자를 설정해 주세요 >");
		this.targetNum = sc.nextInt();
		this.currTotal = 0;
		
	}
	
	private Player[] genPlayer () {
		
		for (int i = 0; i < players.length; ++i) {
			players[i] = new Player(i + 1);
		}
		
		return players;
	}
	
	public void gameInfo() {
		System.out.printf("%d 명의 플레이어님이 목표숫자 %d까지 함께하는 게임을 시작합니다. \n",
				numPlayer, targetNum);
	}
	
	public void play() {
		boolean gameOver = false;

		
		while (!gameOver) {
			
			if (currTotal >= targetNum) {
				gameOver = true;
				break;
			}
			
			for (int i = 0; i < players.length; ++i) {
				System.out.printf("%d번 플레이어님 숫자를 입력해 주세요.\n",
						players[i].idx);
				int num = sc.nextInt();
				if (num > 3 || num < 0) {
					System.out.println("1 ~ 3 사이의 숫자를 입력해 주세요");
				} else {
					currTotal += num;
					players[i].score += 10;
				}
			}
		}
	}
}
	

class Player {
	String name;
	int idx;
	int score;
	
	public Player (int num) {
		this.idx = num;
		this.name = idx + "번 플레이어님";
		this.score = 0;
	}
}

public class C07_31Game {
	/*
	 
	 	# 31 Game
	 	
	 	- 프로그램을 시작하면 게임에 참여하는 인원과 마지막 숫자를 설정한다
	 	- 이전 사람이 골랐던 숫자에 +1 ~ +3씩 더할 수 있다
	 	- 게임을 진행하다가 마지막 숫자를 입력하게 되는 사람이 패배한다
	 
	 */
	
	public static void main(String[] args) {
		
		Game_31 g31 = new Game_31();
		
		g31.gameInfo();
		g31.play();
		
	}

}


