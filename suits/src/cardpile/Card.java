package cardpile;

public class Card{	  	  		      	     	      	     	
 	     	
	  private String suit;	  	  		      	     	      	     	
	  private String cardNumber;	  	  		      	     	      	     	
	  private int value;	  	  		      	     	      	     	
		  	  		      	     	      	     	
	  public void setSuit(String suit)	  	  		      	     	      	     	
	  {	  	  		      	     	      	     	
	     this.suit = suit;	  	  		      	     	      	     	
	  }	  	  		      	     	      	     	
		  	  		      	     	      	     	
	  public String getSuit()	  	  		      	     	      	     	
	  {	  	  		      	     	      	     	
	     return this.suit;	  	  		      	     	      	     	
	  }	  	  		      	     	      	     	
		  	  		      	     	      	     	
	  public void setCardNumber(String cardNumber)	  	  		      	     	      	     	
	  {	  	  		      	     	      	     	
	     this.cardNumber = cardNumber;	  	  		      	     	      	     	
	  }	  	  		      	     	      	     	
		  	  		      	     	      	     	
	  public String getCardNumber()	  	  		      	     	      	     	
	  {	  	  		      	     	      	     	
	     return this.cardNumber;	  	  		      	     	      	     	
	  }	  	  		      	     	      	     	
		  	  		      	     	      	     	
	  public void setValue(int Value)	  	  		      	     	      	     	
	  {	  	  		      	     	      	     	
	     this.value = Value;	  	  		      	     	      	     	
	  }	  	  		      	     	      	     	
		  	  		      	     	      	     	
	  public int getValue()	  	  		      	     	      	     	
	  {	  	  		      	     	      	     	
	    return this.value;	  	  		      	     	      	     	
	  }	  	  		      	     	      	     	
		  	  		      	     	      	     	
	  public int getValue(boolean AceAbility)	  	  		      	     	      	     	
	  {	  	  		      	     	      	     	
	    if (AceAbility == true && this.cardNumber == "Ace"){	  	  		      	     	      	     	
	      return 11;	  	  		      	     	      	     	
	    }else {	  	  		      	     	      	     	
	      return this.value;	  	  		      	     	      	     	
	    }	  	  		      	     	      	     	
	  }	  	  		      	     	      	     	
	}	  	  		      	     	      	     	

