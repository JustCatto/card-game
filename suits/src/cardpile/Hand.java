package cardpile;

public class Hand extends Cardpile {

	public Hand(String deckName) {
		super(deckName);
	}
	
	public void printPile() {
		
		for (int i = 0;i<this.pile.size();i++) {
			Card currentCard = this.pile.get(i);
			System.out.println(currentCard.getSuit());
			System.out.println(currentCard.getCardNumber());
			
		}
	}
	
	

}
