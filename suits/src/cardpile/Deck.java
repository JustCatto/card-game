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
			  int value = 0;
			  if (n+1 > 10) {
				  value = 10;
			  } else {
				  value = n+1;
			  }
			  Card card = new Card(this.SUITS[s],this.CARDNUMBERS[n],value);
			  card.setSuit(this.SUITS[s]);
			  card.setCardNumber(this.CARDNUMBERS[n]);
			  this.pile.add(card);
		  }
	  }
  }    	     	      	     	
}