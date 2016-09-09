import java.util.Scanner;

public class bmi_calculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What's your height in inches?");
		double height = kb.nextDouble();
		System.out.println("What's your weight in pounds?");
		double weight = kb.nextDouble();
		double b = 703*(weight/(height*height));
		
		System.out.println(b +" is your BMI!");
	}
}