package Basic;

public class Saddle_Num {

	static int cnt = 0;

	public static void main(String[] args) {
		int a[][] = {
					{ 6, 3, 1 },
					{ 9, 7, 8 },
					{ 3, 4, 5 }
					};
		loopI(a, 0);
		if (cnt == 0)
			System.out.println("not found");
	}
	private static void loopI(int[][] a, int i)
	{
		if (i < a.length)
		{
			loopj(a, i, 0);
			loopI(a, i+1);
		}
	}
	private static void loopj(int[][] a, int i, int j)
	{
		if (j < a[i].length) 
		{
			boolean smallinRow = true;
			boolean largeinCol = true;

			smallinRow = loopK(a, i, j, smallinRow, 0);
			largeinCol = loopK1(a, i, j, largeinCol, 0);

			if (smallinRow && largeinCol) 
			{
				System.out.println(a[i][j]);
				cnt++;
			}
			loopj(a, i, j + 1);
		}
	}
	private static boolean loopK1(int[][] a, int i, int j, boolean largeinCol, int k)
	{
		if (k < a.length)
		{
			if (a[k][j] > a[i][j])
			{
				return false;
			}
			return loopK1(a, i, j, largeinCol, k + 1);
		}
		return largeinCol;
	}
	private static boolean loopK(int[][] a, int i, int j, boolean smallinRow, int k) 
	{
		if (k < a.length) 
		{
			if (a[i][k] < a[i][j]) 
			{
				smallinRow = false;
				return smallinRow;
			}
			return loopK(a, i, j, smallinRow, k + 1);

		} else
			return smallinRow;
	}
}
