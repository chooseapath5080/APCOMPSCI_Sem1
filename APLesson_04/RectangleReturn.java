import java.util.Scanner;
public class RectangleReturn
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your length: ");
		int l = kb.nextInt();
		System.out.println("Please enter your height: ");
		int w = kb.nextInt();
		
		print(calcPerim(l,w));
	}
	public static int calcPerim(int l, int w)
	{
		return 2*(l+w);
	}
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %.5f ft around", perimeter);
	}
}