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
		String[] rank1 = {"10", "Jack", "Queen"};
		String[] suit1 = {"Clubs", "Diamonds", "Spades"};
		int[] value1 = {10, 11, 12};
	    Deck deck1 = new Deck(rank1, suit1, value1);
	    System.out.println("Is Deck 1 Size 3: " + deck1.size());
	    
	    String[] rank2 = {"4", "King", "Jack"};
	    String[] suit2 = {"Diamonds", "Spades", "Hearts"};
	    int[] value2 = {4, 13, 11};
	    Deck deck2 = new Deck(rank2, suit2, value2);
	    System.out.println("Is Deck 2 Empty?: " + !deck2.isEmpty());
	    
	    String[] rank3 = {"7", "6", "Jack"};
	    String[] suit3 = {"Hearts", "Clubs", "Spades"};
	    int[] value3 = {7, 6, 11};
	    Deck deck3 = new Deck(rank3, suit3, value3);
	    System.out.println("Deck 3's dealt card is: " + deck3.deal());
	}
}
