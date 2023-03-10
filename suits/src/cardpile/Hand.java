package cardpile;

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
	}
	

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	

	public int getValue() {
		int value = 0;
		for (int i = 0;i < this.pile.size();i++) {
			Card currentCard = this.pile.get(i);
			if (currentCard.getCardNumber().equals("Ace") && value + 11 <= 21) {
				value += 11;
			} else {
				value += currentCard.getValue();
			}
		}
		return value;
	}

	
	

}
