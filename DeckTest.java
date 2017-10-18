import junit.framework.TestCase;

public class DeckTest extends TestCase {
	private Deck deck;
	protected void setUp() throws Exception {
        	super.setUp();
        	deck = new Deck(52);
   	}
	public void testFirstCardEqualsAce() throws Exception {
		setUp();
		Card card = new Card(0,0);
		assertEquals(deck.getFirstCard(),card.toString());
	}
	
	public void testDesckIsNotNull() throws Exception {
		setUp();
		assertNotNull(deck);
	}
	
	public void testConstructors() throws Exception {
		setUp();
		Deck deck1 = new Deck(24);
		assertNotSame(deck, deck1);
	}
	
	public void testConstructors2() throws Exception {
		setUp();
		Deck deck1 = new Deck(52);
		assertFalse(deck == deck1);
	}
	
	public void testAfterShuffleAndTestDeckExist() throws Exception {
		setUp();
		deck.shuffle();
		deck.sort();
		assert(deck != null);
	}
	
	public void testShuffleFirstCardIsntNull() throws Exception {
        	setUp();
        	Card card = new Card(0,0);
        	deck.shuffle();
        	assertNotNull(deck.getFirstCard());
	}
	
	public void testShuffleFirstCardIsntNull() throws Exception {
        	setUp();
        	Card card = new Card(0,0);
        	deck.shuffle();
        	assertNotNull(deck.getFirstCard());
	}
}
