public class Human
{
	//instance variables
	private String hair, eyes, skin;
	
	public Human()
	{
		//default values for instance vars
		hair = "";
		eyes = "";
		skin = "";
	}
	
	//Constructor with params
	public Human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Modifier
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Accessors
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}