package array;

import java.util.Arrays;

public class Q21 {
	
	public static void main (String []args)
	{
		int a[][]={ {1,1,1,1},
				    {1,1,1,1},
				    {1,1,1,1},
				   {1,1,1,1}};
		int b[][]={ {11,12,13,14},
			        {15,16,17,18},
			        {9,8,7,6},
			       {2,3,4,5}};
		
		int c[][]=new int [a.length][b.length];
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++) 
			{
			
			c[i][j]=a[i][j]+b[i][j];
			}
		}
for (int i = 0; i < c.length; i++) 
{
	for (int j = 0; j < c.length; j++) 
	{
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
	}

}
