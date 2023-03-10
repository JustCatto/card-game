package blackjack;
import cardpile.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	private Deck deck = new Deck("Main Deck");
	private ArrayList<Hand> players = new ArrayList<Hand>();
	private Scanner input = new Scanner(System.in);
	
	
	public void game() {
		boolean gameend = false;
		while (gameend != true) {
			gameend = true;
			for (int i = 0;i<this.players.size();i++) {
				Hand currentPlayer = this.players.get(i);
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
		this.outputWinners(this.getWinners());
	}
	
	public void outputWinners(ArrayList<Hand> winners) {
		if (winners.size() == 0) {
			System.out.println("No players won!");
		} else if (winners.size() == 1) {
			System.out.println(winners.get(0).getDeckName()+ " Won the game!");
		} else {
			for (int i = 0;i<winners.size();i++) {
				System.out.print(winners.get(i).getDeckName()+" ");
			}
			System.out.print("Tied!");
		}
	}
	
	public ArrayList<Hand> getWinners(){
		ArrayList<Hand> winners = new ArrayList<Hand>();
		int min = players.get(0).getValue()-21;
		for (int i = 1;i<this.players.size();i++) {
			Hand currentPlayer = this.players.get(i);
			int diff = currentPlayer.getValue()-21;
			if (min>diff) {
				min = diff;
				winners.clear();
				winners.add(currentPlayer);
			} else if (min == diff) {
				winners.add(currentPlayer);
			}
		}
		return winners;
	}
	
	public boolean getDrawDecision() {
		boolean valid = false;
		while (valid == false) {
			String decision = "";
			System.out.println("Please input if you will draw or stick. [D/S]\n-->");
			decision = this.input.nextLine();
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
		Card pickedCard = this.deck.getCard();
		this.deck.removeCard(0);
		hand.addCard(pickedCard);
	}

}
