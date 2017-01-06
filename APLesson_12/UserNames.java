public class UserNames
{
	//instance variables
	private String userName, firstName, lastName;
	
	//default constructor
	public UserNames(String fName, String lName)
	{
		//default values for instance vars
		userName = "";
		firstName = fName;
		lastName = lName;
	}
	
	//Constructor with params
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
		public String getFirstName()
	{
		return firstName;
	}
	
		public String getLastName()
	{
		return lastName;
	}
}