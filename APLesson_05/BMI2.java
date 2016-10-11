import java.util.Scanner;
public class BMI2
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Height?");
		double height = kb.nextDouble();
		System.out.println("Weight?");
		double weight = kb.nextDouble();
		
		double BMI = 703*(weight/(height*height));
		String condition = calcCondition(BMI);
		
		System.out.println("Your BMI is " + BMI);
		System.out.println("your condition is " + condition);
	}
	
	public static String calcCondition(double BMI)
	{
		if(BMI < 18.5)
			return "Underweight";
		else if(BMI < 24.9)
			return "Normal";
		else if(BMI < 29.9)
			return "Overweight";
		else if(BMI < 34.9)
			return "Obese";
		else if(BMI < 39.9)
			return "Very Obese";
		else
			return "Morbidly Obese";
	}
}