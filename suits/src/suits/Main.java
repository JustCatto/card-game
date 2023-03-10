package suits;
import higherorlower.*;
import randomcardpicker.*;

public class Main {

	public static void main(String[] args) {
		CardPicker cardPicker = new CardPicker();
		cardPicker.pickcards(5);
		
		HigherOrLower game = new HigherOrLower();
		game.game();

	}

}
