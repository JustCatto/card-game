package cardpile;
import java.util.Collections;

public class Deck extends Cardpile{	      	     		  	  		      	     	      	     	
    
  
  public Deck(String deckName) {
		super(deckName);
	}

//CONSTANTS FOR DECK GENERATION
  private final String[] SUITS = {"Diamond","Heart","Club","Spade"}; 
  private final String[] CARDNUMBERS = {"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};
	  	  		     
  public void shuffleDeck() {
	  Collections.shuffle(this.pile);
  }
  
  public void populateDeck() {
	  for (int s = 0;s<this.SUITS.length;s++) {
		  for (int n = 0;n<this.CARDNUMBERS.length;n++) {
			  Card card = new Card();
			  card.setSuit(this.SUITS[s]);
			  card.setCardNumber(this.CARDNUMBERS[n]);
			  if (n+1 > 10) {
				  card.setValue(10);
			  } else {
				  card.setValue(n+1);
			  }
			  this.pile.add(card);
		  }
	  }
  }    	     	      	     	
}