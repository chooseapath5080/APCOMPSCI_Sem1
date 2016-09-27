import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length:");
		l = kb.nextDouble();
		
		System.out.println("Please enter the width:");
		w = kb.nextDouble();
		
		calcPerim();
		
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = (2*l) + (2*w);
	}
	
	public static void print()
	{
		System.out.printf("Your perimeter is %.5f feet around",perimeter);
	}
}