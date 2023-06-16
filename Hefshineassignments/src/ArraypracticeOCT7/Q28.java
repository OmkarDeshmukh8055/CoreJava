package ArraypracticeOCT7;

public class Q28 
{

	public static void main(String[] args) 
	{
		int [][]a= {{6,3,1},
				   {9,7,8},
				   {2,4,5}};

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				int smallInRow=0;
				int largeIncol=0;
			
				for (int k = 0; k < a.length; k++)
				{
					for (int k2 = 0; k2 < a.length; k2++)
					{
						if(i==k) {
							if(a[k][k2]<a[i][j])
								smallInRow++;
						}
							else if(j==k2) 
								if(a[k][k2]>a[i][j])
									largeIncol++;
							
					}
				}
				if(smallInRow==0 && largeIncol==0)
					System.out.println(a[i][j]);
			}
		}
	}

}
