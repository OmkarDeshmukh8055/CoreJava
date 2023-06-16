package practice;

public class MultiplicationOfTwoArray {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},
					{4,5,6}};
		
		int b[][]= {{1,2},
				{4,5},
				{7,8}};
		
	int c[][]=new int[a.length][b[0].length];
//		for (int i = 0; i < a.length; i++) 
//		{
//			for (int j = 0; j < b[i].length; j++)
//			{
//				for (int k = 0; k <b.length; k++)
//				{
//					c[i][j]=c[i][j]+a[i][k]*b[k][j];
//				}
//			}
//		}
		c=multi(a,b,c,0);
		
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] multi(int[][] a, int[][] b,int c[][], int i) 
	{
		if(i<a.length)
		{
			loopJ(a,b,c,i,0);
			return multi(a, b, c, i+1);
		}
		return c;
	}

	private static void loopJ(int[][] a, int[][] b, int[][] c, int i, int j)
	{
		if(j<b[i].length)
		{
			
			loopJ1(a, b, c, i, j,0);

			loopJ(a, b, c, i, j+1);
		}
	}

	private static void loopJ1(int[][] a, int[][] b, int[][] c, int i, int j, int k) {
		if(k<b.length)
		{
			c[i][j]=c[i][j]+a[i][k]*b[k][j];
			loopJ1(a, b, c, i, j, k+1);
		}
	}

}
