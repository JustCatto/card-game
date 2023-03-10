package blackjack;
import cardpile.*;
import java.util.ArrayList;

public class Game {
	
	private Deck deck = new Deck("Main Deck");
	private ArrayList<Hand> players = new ArrayList<Hand>();
	
	public void game() {
		
	}
	
	public void startGame() {
		deck.populateDeck();
		deck.shuffleDeck();
		
	}
	
	public void initPlayers(int p) {
		for (int i = 0;i < p; i++) {
			Hand player = new Hand("Player "+Integer.toString(i));
			players.add(player);
		}
	}
	
	
	
	public void drawCard(Hand hand) {
		Card pickedCard = deck.getCard();
		deck.removeCard(0);
		hand.addCard(pickedCard);
	}

}
