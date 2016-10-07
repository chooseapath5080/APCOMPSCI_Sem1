import java.util.Scanner;
import java.util.Random;
public class Discount
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Item 1?");
		String i1 = kb.nextLine();
		System.out.println("Item 1 Price?");
		double p1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Item 2?");
		String i2 = kb.nextLine();
		System.out.println("Item 2 Price?");
		double p2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Item 3?");
		String i3 = kb.nextLine();
		System.out.println("Item 3 Price?");
		double p3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Item 4?");
		String i4 = kb.nextLine();
		System.out.println("Item 4 Price?");
		double p4 = kb.nextDouble();
		kb.nextLine();
		
		double total = p1 + p2 + p3 + p4; 
		
		double discount = discount(total);
		
		System.out.println("<<<<<<<<< Receipt >>>>>>>>>>>");
		format(i1, p1);
		format(i2, p2);
		format(i3, p3);
		format(i4, p4);
		format("Discount: ", discount);
		System.out.println("_____________________________");
	}
	
	public static double discount(double total)
	{
		double discount = 0;
		if (total >= 2000)
		{
			return total*0.15;
		}
		if (total < 2000)
		{
			discount = 0;
		}
		return discount;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("%10s........... %.2f\n",item,price);
	}
}