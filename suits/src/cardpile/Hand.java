package cardpile;
import java.util.ArrayList;

public class Hand extends Cardpile {

	private boolean finished = false;
	
	public Hand(String deckName) {
		super(deckName);
	}
	
	public void printHand() {
		System.out.println(this.deckName+"s Hand-\n\n");
		for (int i = 0;i<this.pile.size();i++) {
			Card currentCard = this.pile.get(i);
			String suit = currentCard.getSuit();
			String cardNumber = currentCard.getCardNumber();
			System.out.print(cardNumber+" Of "+suit+"s\t");
		}
		System.out.println("\n\n");
	}
	

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	

	public int getTotalValue() {
		int value = 0;
		ArrayList<Card> aces = new ArrayList<Card>();
		for (int i = 0;i < this.pile.size();i++) {
			Card currentCard = this.pile.get(i);
			if (currentCard.getCardNumber().equals("Ace")) { // This is a REALLY dumb way of weeding out aces, but i 
				aces.add(currentCard); 						 // literally can't see any other way of doing this.
			} else {
				value += currentCard.getValue();
			}
		}
		for (int i = 0;i<aces.size();i++) {
			Card currentCard = aces.get(i); // For readability, i don't want to go insane
			if (value+currentCard.getValue(true) <= 21) {
				value += currentCard.getValue(true);
			} else {
				value++;
			}
		}
		return value;
	}

	
	

}
