import java.util.Scanner;
public class StudyGuide
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("First item");
		double item1 = kb.nextDouble();
		System.out.println("Second item");
		double item2 = kb.nextDouble();
		
		format(item1,item2);
	}
	
	public static void format(double one, double two)
	{
		System.out.printf("The total cost of your order is %f",one+two);
	}
}