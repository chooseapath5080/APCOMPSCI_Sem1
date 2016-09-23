import java.util.Scanner;

public class CompoundInterest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		//Create a new object of your class
		CompoundInterest loan = new CompoundInterest();
		
		System.out.println("Rate?");
		double rate = kb.nextDouble();
		
		System.out.println("Principal?");
		double principl = kb.nextDouble();
		
		System.out.println("Time?");
		double time = kb.nextDouble();
		
		System.out.println("Number?");
		double number = kb.nextDouble();
		
		//method call
		System.out.printf("Your total monthly payment is %5.2f",loan.payment(rate,principl,time,number));
		
	}
	
	public double payment(double r, double p, double t, double n) 
	{
		//all your math goes here
		return (p*(Math.pow(1+(r/n), n*t))/(12*t));
		//Math.pow(number, exponent)
		//Math.pow(1+(r/n), n*t)
		//p*(Math.pow(1+(r/n), n*t))
		//(p*(Math.pow(1+(r/n), n*t))/(12*t))
	}
}