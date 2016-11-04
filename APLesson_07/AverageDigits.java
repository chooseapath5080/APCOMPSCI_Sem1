import java.util.Scanner;
public class AverageDigits
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = kb.nextInt();
		int digits = 0;
		int average = 0;
		System.out.println("The average of the digits in " + number + " is " + avDigits(number,average, digits));
	}
	
	static int avDigits(int number, int average, int digits)
	{
		int num = number;
		while(num>0)
		{
			digits += 1;
			average += digits%10;
			num /= 10;
		}
		return average/digits;
	}
}