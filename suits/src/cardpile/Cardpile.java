package cardpile;
import java.util.ArrayList;

public class Cardpile {
	
    protected ArrayList<Card> pile = new ArrayList<Card>();	  	  		      	     	      	     	
    protected String deckName;
    
    public Cardpile(String deckName) {
    	this.deckName = deckName;
    }
    
	public String getDeckName() {
		return deckName;
	}
	
	public void setDeckName(String deckName) {
		this.deckName = deckName;
	}
	
	public ArrayList<Card> getDeck() {
		return this.pile;
	}
	
	public void setDeck(ArrayList<Card> deck) {
		this.pile = deck;
	}
	
	public void addCard(Card card) {
		this.pile.add(card);
	}
	
	public void removeCard(int i) {
		this.pile.remove(i);
	}
	
	public Card drawCard() {
		Card card = this.pile.get(0);
		this.pile.remove(0);
		return card;
		
	}

}
