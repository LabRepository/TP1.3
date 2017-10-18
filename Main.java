/**
 * 
 * @author Weronika Jasiak
 *
 */
public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck(52);
		if(deck.getCards() != 0) {
			System.out.println("Deck of " + deck.getCards() + " cards");
			//deck.shuffle();
			//deck.sort();
			System.out.println(deck.getFirstCard());
	    }
//		else {
//		System.out.println("Try again!");
//		}
		
	}
}