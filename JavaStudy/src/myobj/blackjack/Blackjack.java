package myobj.blackjack;

import java.util.Collections;
import java.util.Scanner;

public class Blackjack {
	
	int BLACK_JACK = 21;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean gameOver = false;
		while (!gameOver) {
			Player p1 = new Player();
			Player dealer = new Player();
			Deck deck = new Deck();
			Collections.shuffle(deck.cards);
			System.out.println("***BlackJack***");
			
			if (p1.chip == 0) {
				gameOver = true;
			}
			System.out.println("현재 보유중인 칩은 " + p1.chip + "입니다.");
			System.out.println("배팅할 칩을 입력해 주세요");
			int bet = sc.nextInt();
			
			if (bet > p1.chip || bet < 0) {
				System.out.println("다시 입력해 주세요.");
				continue;
			} else {
				p1.chip = p1.chip - bet;
			}
			
			System.out.println("남은 칩은 " + p1.chip + "입니다.");
			System.out.println("게임을 시작합니다.");
			
			while (p1.total < 21) {
				
				p1.hand.add(deck.cards.get(0));
				p1.total += Integer.parseInt(p1.hand.get(0).num);
				p1.hand.add(deck.cards.get(1));
				p1.total += Integer.parseInt(p1.hand.get(1).num);
				System.out.println("현재 숫자 " + p1.total);
	
				System.out.println(p1.hand.toString());
				
				System.out.println("카드를 더 받으려면 1 / 멈추려면 2를 입력하세요>> ");
				int isBet = sc.nextInt();
				
				if (isBet == 1) {
					p1.hand.add(deck.cards.get(2));
					p1.total += Integer.parseInt(p1.hand.get(2).num);
					System.out.println("현재 숫자 " + p1.total);
				} else {
					break;
				}
				break;
			}
			
			Collections.shuffle(deck.cards);			
			int i = 0;
			while (dealer.total < 16) {
				dealer.hand.add(deck.cards.get(i));
				dealer.total += Integer.parseInt(deck.cards.get(i).num);
				
			}
			
			break;
			
		}
	}
}
