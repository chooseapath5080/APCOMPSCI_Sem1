public class TwoD_1
{
	public static void main(String[]args)
	{
		//filling the array
		int[][]values = new int [4][4];
		values [0][0] = 1;
		values [1][1] = 2;
		values [2][2] = 3;
		values [3][3] = 4;
		
		//printing the array
		for(int i = 0; i< values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				System.out.print(values[i][j]);
			}
			System.out.println();
		}
	}
}