public class TwoD_2
{
	public static void main(String[]args)
	{
		//filling the array
		int[][]values = new int [4][4];
		
/* 		//adding values with a for loop
		int num = 1;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				values[i][j] = num;
				num++;
			}
		} */
		
		//printing vertically
		int num = 1;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				values[j][i] = num; //now inside loop w/ j is controlling which row we're in
				num++;
			}
		}
		
		//printing the array
		for(int i = 0; i< values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++) //starting point in row
			{
				System.out.print(values[i][j] + "\t"); //iterates through row
			}
			System.out.println();
		}
		
		//search the array
		int count = 0;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				if(values[i][j] % 5 == 0)
				{
					count ++;
				}
			}
		}
		System.out.println("There are" + count + "multiples of 5 in the array.");
	}
}