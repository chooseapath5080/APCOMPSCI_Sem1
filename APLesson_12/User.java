public class User
{
	//instance variables
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
		
	public User()
	{
		//default values for instance vars
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	//Constructor with params
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	//second constructor
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	//Modifier
	public void setAvatar(String a)
	{
		avatar = a;
	}
	
	//Accessors
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
                           "\nLast Name: " + lastName +
                           "\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
	}
	

}