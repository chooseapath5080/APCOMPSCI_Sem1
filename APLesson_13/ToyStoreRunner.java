public class ToyStoreRunner
{
	String object;
	Car car = new Car();
	AFigure afigure = new AFigure();
	
	public static void main(String[]args)
	{
		ToyStore object = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(object);
		System.out.println("The most Frequent Toy: " + object.getMostFrequentToy());
		System.out.println("The most Frequent Toy type(): " + object.getMostFrequentType());
	}
}
