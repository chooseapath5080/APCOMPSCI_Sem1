public class GameSystem
{
	private String platform;
	private int serialNo;
	
	GameSystem()
	{
		platform = "";
		serialNo = 0;
	}
	
	GameSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random()*10000000) + 1;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getserialNo()
	{
		return serialNo;
	}
}