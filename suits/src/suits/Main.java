package suits;
import higherorlower.*;
import randomcardpicker.*;
import blackjack.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean end = false;
		Scanner input = new Scanner(System.in);
		while (end == false) {
			printMenu();
			int number = input.nextInt();
			if (number == 1) {
				CardPicker cardPicker = new CardPicker();
				cardPicker.pickcards(5);
			} else if (number == 2) {
				HigherOrLower game = new HigherOrLower();
				game.game();
			} else if (number == 3) {
				Blackjack game = new Blackjack();
				game.game(2);
			} else if (number == 4) {
				end = true;
			} else {
				System.out.println("Please enter a number 1-4.");
			}
		}
		input.close();
	}
	
	public static void printMenu() {
		System.out.println("1 For Cardpicker");
		System.out.println("2 For HigherOrLower");
		System.out.println("3 For Blackjack");
		System.out.println("4 For Exit");
	}

}
