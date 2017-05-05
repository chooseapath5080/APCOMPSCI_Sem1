/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card one = new Card("9", "Clubs", 9);
		Card two = new Card("8", "Diamonds", 8);
		Card three = new Card("2", "Spades", 2);
  
		System.out.println("One matches two? " + one.matches(two));
		System.out.println("One matches three? " + one.matches(three));    
		System.out.println("Suit of Card One: " + one.suit());
		System.out.println("Card one: " + one.toString());
	}
}
