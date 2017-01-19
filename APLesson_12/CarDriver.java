import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("paint?");
		String paint = kb.next();
		System.out.println("interior?");
		String interior = kb.next();
		System.out.println("engine?");
		String engine = kb.next();
		System.out.println("tires?");
		String tires = kb.next();
		
		CarClass object = new CarClass(paint, interior, engine, tires);
		System.out.println("Your vehicle is ready....");
		System.out.println("paint: "+object.getPaint());
		System.out.println("interior: "+object.getInterior());
		System.out.println("engine: "+object.getEngine());
		System.out.println("tires: "+object.getTires());
	}
}