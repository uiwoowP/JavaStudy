package myobj.blackjack;

import java.util.ArrayList;

public class Player {
	int total;
	public int chip;
	int numCard;
	ArrayList<Card> hand;
	
	public Player() {
		this.total = 0;
		this.chip = 1500;
		this.numCard = 0;
		hand = new ArrayList<Card>();
	}
	
	void info() {
		System.out.printf("현재 총점은 %d 점 입니다.");
	}
	
}
