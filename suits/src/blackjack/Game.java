package blackjack;
import cardpile.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	private Deck deck = new Deck("Main Deck");
	private ArrayList<Hand> players = new ArrayList<Hand>();
	
	public void game() {
		boolean gameend = false;
		while (gameend != true) {
			gameend = true;
			for (int i = 0;i<players.size();i++) {
				Hand currentPlayer = players.get(i);
				if (!currentPlayer.isFinished()){
					System.out.println("It is player- "+currentPlayer.getDeckName()+"'s Turn.");
					System.out.println("Deck Value- "+currentPlayer.getValue());
					if (this.getDrawDecision() == true) {
						this.drawCard(currentPlayer);
						gameend = false;
					} else {
						currentPlayer.setFinished(true);  
					}
				}
			}
		}
	}
	
	public void getWinners(){
		ArrayList<Hand> winners = new ArrayList<Hand>();
		int min = players.get(0).getValue()-21;
		for (int i = 1;i<this.players.size();i++) {
			
		}
	}
	
	public boolean getDrawDecision() {
		Scanner input = new Scanner(System.in);
		boolean valid = false;
		while (valid == false) {
			String decision = "";
			System.out.println("Please input if you will draw or stick. [D/S]\n-->");
			decision = input.nextLine();
			if (decision.equalsIgnoreCase("D")){
				return true;
			} else if (decision.equalsIgnoreCase("S")) {
				return false;
			} else {
				System.out.println("Please enter either D or S.\n-->");
			}
		}
		return false;
	}
	
	public void startGame(int playernum) {
		this.initDeck();
		this.initPlayers(playernum);
		this.getStartingCards();
	}
	
	public void getStartingCards() {
		for (int i = 0;i<this.players.size();i++) {
			Hand currentPlayer = this.players.get(i);
			this.drawCard(currentPlayer);
		}
	}
	
	public void initDeck() {
		this.deck.populateDeck();
		this.deck.shuffleDeck();
	}
	
	public void initPlayers(int p) {
		for (int i = 0;i < p; i++) {
			Hand player = new Hand("Player "+Integer.toString(i));
			this.players.add(player);
		}
	}
	
	public void drawCard(Hand hand) {
		Card pickedCard = deck.getCard();
		this.deck.removeCard(0);
		hand.addCard(pickedCard);
	}

}
