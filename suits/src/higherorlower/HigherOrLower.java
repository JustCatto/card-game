package higherorlower;

import cardpile.Deck;
import cardpile.Card;
import java.util.Scanner;

public class HigherOrLower {
	
	public void game() {
		Scanner input = new Scanner(System.in);
		Deck deck = new Deck("Deck");
		deck.populateDeck();
		deck.shuffleDeck();
		boolean lost = false;
		int score = 0;
		while (lost == false) {
			Card currentCard = deck.getCard();
			deck.removeCard(0);
			Card nextCard = deck.getCard();
			deck.removeCard(0);
			System.out.println(currentCard.getValue());
			boolean valid = false;
			while (valid == false) {
				System.out.println("Higher or lower? [H/L]");
				String decision = input.nextLine();
				if (decision.equalsIgnoreCase("H")) {
					valid = true;
					if (currentCard.getValue() < nextCard.getValue()) {
						score++;
					} else {
						lost = true;
					}
				} else if (decision.equalsIgnoreCase("L")) {
					valid = true;
					if (currentCard.getValue() > nextCard.getValue()) {
						score++;
					} else {
						lost = true;
					}
				} else {
					System.out.println("Please input either H or L.");
				}
			}
			deck.addCard(currentCard);
			deck.addCard(nextCard);
			deck.shuffleDeck();
		}
		System.out.println("Your score was- "+score);
		input.close();
	}

}
