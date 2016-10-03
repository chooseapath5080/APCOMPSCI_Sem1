import java.util.Scanner;
public class CubeReturn
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your side length: ");
		int s = kb.nextInt();
		
		print(s, calcSurf(s));
	}
	public static int calcSurf(int s)
	{
		return 6*(s^2);
	}
	public static void print(double s, double SA)
	{
		System.out.printf("The surface area of a cube whose sides are " + s + " is %.5f.", SA);
	}
}