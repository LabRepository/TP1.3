import java.util.Arrays;
import java.util.Random;
/**
 * 
 * @author Weronika Jasiak
 *
 */
public class Deck {
	//Index of array equals position in Deck 0 == Top of Deck
	private Card[] cards;
	// Number of cards in the deck
	int n; 
	/**
	 * Class constructor
	 */
	public Deck(int m) {
		// How many cards do you want?
		n = m;
		int x = 0;
		switch(n) {
		case 52:
			cards = new Card[52];
			for(int s = 0; s <= 3; s++) {
				for(int r = 0; r <= 12; r++) {
					cards[x] = new Card(s,r);
					x++;
				}
			}
			break;
		case 32:
			cards = new Card[32];
			for(int s = 0; s <= 3; s++) {
				for(int r = 0; r <= 7; r++) {
					cards[x] = new Card(s,r);
					x++;
				}
			}
			break;
		case 24:
			cards = new Card[24];
			for(int s = 0; s <= 3; s++) {
				for(int r = 0; r <= 5; r++) {
					cards[x] = new Card(s,r);
					x++;
				}
			}
			break;
		default: 
			System.out.println("Wrong number of cards!");
		}
		
	} 

	public void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int index = (int)(Math.random() * cards.length);
			Card temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
	}
	
	public void sort() {
		Arrays.sort(cards);
	}
	
	public String getFirstCard() {
		 return cards[0].toString();
	}
	 
	public int getCards() {
		if(n == 52 || n == 32 || n == 24) {
			return n;
		}
		else {
			return 0;
		}
	}
} 