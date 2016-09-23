import java.util.Scanner;

public class subwoofer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		subwoofer measure = new subwoofer();
		
		System.out.println("Height?");
		double height = kb.nextDouble();
		
		System.out.println("Length?");
		double length = kb.nextDouble();
		
		System.out.println("Width?");
		double width = kb.nextDouble();
		
		double cubicfeet = measure.calcVol(height,length,width);
		
		//method call
		System.out.println("The volume in cubic feet is " + cubicfeet);
	}
	
	public double calcVol(double h, double l, double w) 
	{
		return (h*l*w*0.00057850);
	}
}