import java.util.Scanner;
public class DigitAdder
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input your number");
		int number = kb.nextInt();
		int sum = 0;
		System.out.println("The sum of the digits in " + number + "is " + sumDigits(sum,number));
		
	}
	static int sumDigits(int sum, int num)
	{
		while(num>0)
		{
			sum += num%10; 
			num /= 10;
		}
		return sum;
	}
}