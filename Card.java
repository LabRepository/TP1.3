import java.util.Comparator;

/**
 * 
 * @author Weronika Jasiak
 * Class Card represent information about card (suit and rank)
 * 
 */
public class Card implements Comparable<Card> {
	int suit;
	int rank;
	int number;
	String[] suits = { 
			"Hearts", 
			"Spades", 
			"Diamonds", 
			"Clubs" 
	};
	
	String[] ranks = { 
			"Ace",
			"King",
			"Queen",
			"Jack",
			"10",
			"9", 
			"8", 
			"7", 
			"6", 
			"5", 
			"4", 
			"3", 
			"2"
	};
	
	
	
	Card(int suit, int rank) {
		this.rank = rank;
		this.suit = suit;
		this.number = (suit*13)+rank;
	}
	public @Override String toString() {
		return ranks[rank] + " -> " + suits[suit];
	}
	
	public int getRank() {
		return rank;
	}
	public int getSuit() {
		return suit;
	}
	
	@Override
    public int compareTo(Card other) {
        if(this.number > other.number){
            return 1;
        } else if(this.number < other.number){
            return -1;
        } else {
            return 0;
        }
    }
	
}

