/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rank1 = {"Ace", "2","3","4","5","6","7","8","9","10","Jack", "Queen","King"};
		String[] suit1 = {"Clubs", "Diamonds","Spades",	"Hearts"};
		int[] value1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	    Deck deck1 = new Deck(rank1, suit1, value1);
		deck1.shuffle();
	    System.out.println(deck1);
	}
}
