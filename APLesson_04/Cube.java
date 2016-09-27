import java.util.Scanner;
public class Cube
{
	static double side;
	static double SA;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the side length:");
		side = kb.nextDouble();
	
		sa();
		
		print();
	}
	
	public static void sa ()
	{
		SA = 6*side*side;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with %f side length is %.5f.",side,SA);
	}
}
