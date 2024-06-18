package myobj.blackjack_answer;

import java.util.ArrayList;
import java.util.List;

public class Player {
	final public static int USER_PLAYER = 0;
	final public static int DEALER_NOT_OPEN = 1;
	final public static int DEALER_OPEN = 2;
	
	int printType; // 0 이면 일반 플레이어, 1이면 딜러, 2면 카드 오픈하는 딜러
	int money;
	List<Card> hand = new ArrayList<>();
	
	public Player(int type, int money) {
		this.printType = type;
		this.money = money;
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setPrintType(int printType) {
		this.printType = printType;
	}
	
	public void printHand() {
		if (printType == 0) {
			System.out.printf("플레이어: %s *[%d]*\n", hand, GameLogic.getValue(hand));
		} else if (printType == 1) {
			System.out.printf("딜러: X %s\n", hand.get(1));
		} else if (printType == 2) {
			System.out.printf("딜러: %s +[%d]+\n", hand, GameLogic.getValue(hand));
		}
	}
	
	public void resetHand() {
		while (hand.size() > 0) {
			hand.remove(0);
		}
	}
	
	public void printMoney() {
		System.out.println(money);
	}
	
	public void earnMoney(int money) {
		this.money += money;
	}
	
	public void lossMoney(int money) {
		this.money -= money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
}
