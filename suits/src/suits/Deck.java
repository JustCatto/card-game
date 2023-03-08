package suits;
import java.util.ArrayList;	  	  		      	     	      	     	
	     	
public class Deck{	      	     		  	  		      	     	      	     	
    private ArrayList<Card> deck;	  	  		      	     	      	     	
    private String deckName;
    
  
  //CONSTANTS FOR DECK GENERATION
  private final String[] SUITS = {"Diamond","Heart","Club","Spade"}; 
  private final String[] CARDNUMBERS = {"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};
	  	  		      	     	      	     	
  public void setDeck(ArrayList<Card> deck)	  	  		      	     	      	     	
  {	  	  		      	     	      	     	
     this.deck = deck;	  	  		      	     	      	     	
  }	  	  		      	     	      	     	
	  	  		      	     	      	     	
  public ArrayList<Card> getDeck()	  	  		      	     	      	     	
  {	  	  		      	     	      	     	
     return this.deck;	  	  		      	     	      	     	
  }	  	  		      	     	      	     	
	  	  		      	     	      	     	
  public void addToDeck(Card card){	  	  		      	     	      	     	
    this.deck.add(card);	  	  		      	     	      	     	
  }	  	  		      	     	      	     	
	  	  		      	     	      	     	
  public void populateDeck() {
	  this.deck.clear();
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
		  }
	  }
  }    	     	      	     	
	  	  		      	     	      	     	
  public boolean removeFromDeck() {}	  	  		      	     	      	     	
	  	  		      	     	      	     	
  public void setDeckName(String deckName)	  	  		      	     	      	     	
  {	  	  		      	     	      	     	
     this.deckName = deckName;	  	  		      	     	      	     	
  }	  	  		      	     	      	     	
	  	  		      	     	      	     	
  public String getDeckName()	  	  		      	     	      	     	
  {	  	  		      	     	      	     	
     return this.deckName;	  	  		      	     	      	     	
  }
}