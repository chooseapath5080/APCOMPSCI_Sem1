import java.util.Scanner;
public class Rectangle1
{
	static double h;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//variables
		System.out.println("Please enter the height:");
		w = kb.nextDouble();
		System.out.println("Please enter the width:");
		h = kb.nextDouble();
		
		//method call (parameters)
		perimeter = calcPerim(w,h);
		
		//print statement 
		System.out.println("Your perimeter is " + perimeter + "ft.");
	}
	
	public static double calcPerim(double w, double h)
	{
		//use parameter values in calculation
		return 2*(w+h);
	}
}