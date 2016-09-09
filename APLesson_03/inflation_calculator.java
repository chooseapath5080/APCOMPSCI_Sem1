import java.util.Scanner;

public class inflation_calculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How many dollars do you have in your pocket?");
		double money = kb.nextDouble();
		
		double inflation = money*18.87;
		System.out.println("In 1800, your money would have been worth $" + inflation);
	}
}