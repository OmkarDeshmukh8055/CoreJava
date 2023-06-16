package array;

public class CwQ6 {

	public static void main(String[] args) {

		int a[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int b[][]=new int [a[0].length][a.length];

		loopI(a,b,0);
		print(0,b);
		
	}

	private static void print(int i, int[][] b)
	{
		if(i<b.length)
		{
			loopJ(i,b,0);
			System.out.println();
			print(i+1, b);
		}
	}

	private static void loopJ(int i, int[][] b, int j) 
	{
		if(j<b.length)
		{
			System.out.print(b[i][j]);
			loopJ(i, b, j+1);
		}
	}

	private static void loopI(int[][] a, int[][] b, int i) 
	{
		if(i<a.length)
		{
			loopj(a,b,i,0);
			loopI(a, b, i+1);
		}
	}

	private static void loopj(int[][] a, int[][] b, int i, int j)
	{
		if(j<a.length)
		{
			b[j][i]=a[i][j];
			loopj(a, b, i, j+1);
		}
	}

}
