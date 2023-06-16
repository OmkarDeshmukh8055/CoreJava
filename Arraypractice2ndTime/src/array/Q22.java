package array;

public class Q22 {
	
	public static void main (String args[])
	{
		int a[][]={ {1,2,3},
			        {4,5,6}};
			      
	int b[][]={   {4,3},
			      {6,7},
		          {8,7}};
	int c[][]=new int [a.length][a.length];
	
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++) 
		{
			c[i][j]=0;
			for (int k = 0; k < 3; k++) 
			{
				c[i][j]=a[i][k]*b[k][j];
			}
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