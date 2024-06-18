package myobj.blackjack;


public class Card {
	final static String SUITS[] = {"♧", "♤", "♡", "◇"};
	final static String[] RANK_TABLE = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	final static int[] VALUE_TABLE = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}; 
	
	String suit;
	String num;
	int value;
	
	public Card(String suit, String num) {
		this.suit = suit;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return this.suit + "/" + this.num;
	}
	
}
