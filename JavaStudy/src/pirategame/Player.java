package pirategame;

public class Player {
	int playerNum;
	int score;
	int money;
	int tryingCnt;
	
	public Player(int num) {
		this.playerNum = num;
		this.score = 1000;
		this.money = 1000;
		this.tryingCnt = 0;
	}
	
	public void calcScore() {
		this.score += 20 * tryingCnt;
	}
	
	public void playerInfo() {
		System.out.printf("***플레이어 %d 님의 현재 점수는 %d, 돈은 %d 입니다.***\n",
				playerNum + 1, score, money);
	}
	
	public static void main(String[] args) {
		Player p1 = new Player(1);
		
		System.out.println(p1.score);
		p1.tryingCnt += 2;
		p1.calcScore();
		System.out.println(p1.score);
	}
	
}
