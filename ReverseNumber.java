import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = kb.nextInt();
		int num = number;
		int rev = 0;
		System.out.println(number + " reversed is " + getReverse(num, rev));
	}
	
	static int getReverse(int num, int rev)
	{
		while(num>0)
		{
			rev *= 10;
			rev += num%10;
			// for the next step (keep it going)
			num /= 10;
		}
		return rev;
	}
}