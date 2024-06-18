package myobj.blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
	final static String suits[] = {"♧", "♤", "♡", "◇"};
	final static ArrayList<String> cardNum = new ArrayList<String>
	(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		this.cards = setDeck();
	}
	
	ArrayList<Card> setDeck() {
		int idx = 0;
		for (int i = 0; i < suits.length; ++i) {
			for (int j = 0; j < cardNum.size(); ++j) {
				cards.add(new Card(suits[i], cardNum.get(j)));
				idx++;
			}
		}
		return cards;
	}
	
	public static void main(String[] args) {
	
		Deck deck = new Deck();
		
		Collections.shuffle(deck.cards);
		
		for (int i = 0; i < deck.cards.size(); ++i) {
			System.out.println(deck.cards.get(i));
		}
	}
}
