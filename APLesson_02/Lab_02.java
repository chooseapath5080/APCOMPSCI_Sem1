public class Lab_02
{
	public static void main(String[]args)
	{
		int a = 10;
		int b = 20;
		int product = a * b;
		
		System.out.println("10 " + "multiplied by " + "20 " + "is " + product);
		System.out.println("       ");
		
		String name = "Amy Jeon\n";
		String address = "13510 Blue Lace Trail\n";
		String city = "San Diego, CA 92130\n";
		System.out.println(name + address + city);
		
		int l = 3;
		int w = 4;
		int h = 5;
		int SA = 2*w*l+2*l*h+2*h*w;
		
		System.out.println("The surface area of your rectangle is "+ SA);
	}
}