public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore object = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.print(object);
		System.out.print(object.getMostFrequentToy());
		System.out.print(object.getMostFrequentType());
	}
}
