public class UserNamesRunner
{
	public static void main(String[]args)
	{
		System.out.println("Using the constructor....");
		UserNames object = new UserNames("proHndsm", "Professor", "Handsome");
		System.out.println("<<User Info>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
		System.out.println();
		
		System.out.println("Using modifiers.....");
		UserNames object1 = new UserNames("Bob", "Costas");
		object.setUserName("pHandsome");
		System.out.println("<<User Info>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}
}