import java.util.Scanner;
public class InventoryDriver
{
	public static void main(String [] args)
	{
		InventoryItems object;
		Scanner kb = new Scanner(System.in);
		//prompt for manufacturer, name
		System.out.println("Manufacturer?");
		String manufacturer = kb.next();
		System.out.println("Name?");
		String name = kb.next();
		
		System.out.println("Will you be entering name and price info? y or n?");
		String choice = kb.next();
		
		if(choice.equals("n"))
			object = new InventoryItems(manufacturer, name);
		else
		{
			System.out.println("Enter category: ");
			String category = kb.next();
			System.out.println("Enter price: ");
			double price = kb.nextDouble();
			object = new InventoryItems(manufacturer, name, category, price);
		}
			
		
		System.out.println(object);
	}
}