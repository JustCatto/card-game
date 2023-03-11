package randomcardpicker;
import cardpile.Card;
import cardpile.Deck;
import java.util.ArrayList;

public class CardPicker {
	
	public void pickcards(int n) {
		ArrayList<Card> cards = new ArrayList<Card>();
		Deck deck = new Deck("Deck");
		deck.populateDeck();
		deck.shuffleDeck();
		for (int x = 0;x<n;x++) {
			cards.add(deck.getCard());
			deck.removeCard(0);
		}
		for (Card currentCard:cards) {
			String suit = currentCard.getSuit();
			String number = currentCard.getCardNumber();
			System.out.println(number+" of "+suit+"s");
		}
		
	}

}
