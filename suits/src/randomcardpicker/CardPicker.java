package randomcardpicker;
import cardpile.Deck;
import cardpile.Hand;

public class CardPicker {
	
	public void pickcards(int n) {
		Hand hand = new Hand("Hand");
		Deck deck = new Deck("Deck");
		deck.populateDeck();
		deck.shuffleDeck();
		for (int x = 0;x<n;x++) {
			hand.addCard(deck.drawCard());
		}
		hand.printHand();
	}
}
