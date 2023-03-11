package cardpile;
import java.util.Collections;

public class Deck extends Cardpile{	      	     		  	  		      	     	      	     	
    
  
  public Deck(String deckName) {
		super(deckName);
	}

//CONSTANTS FOR DECK GENERATION
  private final String[] SUITS = {"Diamond","Heart","Club","Spade"}; 
  private final String[] CARDNUMBERS = {"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};
  private final int[] CARDVALUES = {1,2,3,4,5,6,7,8,9,10,10,10,10};
	  	  		     
  public void shuffleDeck() {
	  Collections.shuffle(this.pile);
  }
  
  public void populateDeck() {
	  for (String Suit:this.SUITS) {
		  for (int n = 0;n<this.CARDNUMBERS.length;n++) {
			  Card card = new Card(Suit,this.CARDNUMBERS[n],this.CARDVALUES[n]);
			  this.pile.add(card);
		  }
	  }
  }    	     	      	     	
}