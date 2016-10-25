import java.util.Scanner;
public class CountbyX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = kb.nextInt();
		System.out.println("Enter a second number");
		int num2 = kb.nextInt();
		
		for(int i = num2; i <= num1; i+=num2)
		{
			System.out.print(i + " \t");
		}
	}
}