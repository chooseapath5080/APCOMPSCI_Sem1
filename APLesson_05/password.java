import java.util.Scanner;
public class password
{
	static String password;
	static String username;
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("enter your username");
		username = kb.nextLine();
		System.out.println("enter your password");
		password = kb.nextLine();
		
		if(password.equals("jeon") && username.equals("amy"))
			System.out.println("You are granted access!");
		else if(username.equals("amy") || password.equals("jeon"))
			if (username.equals("amy"))
			{
				System.out.println("Your password is incorrect. Try again.");
				passCheck();
			}
			else
			{
				System.out.println("Your username is incorrect. Try again.");
				passCheck();
			}
			
		else
		{
			System.out.println("Your username and password are incorrect. Try again.");
			passCheck();
		}	
	}
}