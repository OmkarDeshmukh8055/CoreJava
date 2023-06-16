package practice;

public class SaddlePoint {

	public static void main(String[] args) {

		int a[][]= {{6, 3 ,1},
			         {9 ,7 ,8},
			          {2, 4,5}};
		int counter=0;
		
		counter=loopI(counter,a,0,0);
		if(counter==0)
			System.out.println("no saddle point");
		

	}

	private static int loopI(int counter, int[][] a, int i, int j)
	{
		if(i<a.length)
		{
			if(j<a.length)
			{
				int cnt=0;
				cnt=loopJ(i,j,a,cnt,counter,0);
				
				int count=0;
				count=loopJ1(i,j,a,count,counter,0);

				
				if(count==0&&cnt==0)
				{
					System.out.println(a[i][j]);
					counter++;
				}
			
			}
			return loopI(counter, a, i+1, j+1);
		}
		return counter;
	}

	private static int loopJ1(int i, int j, int[][] a, int count, int counter, int k) {
		if(k<a.length)
		{
			if(a[i][k]<a[i][j])
				count++;
			return loopJ(i, j, a, count, counter, k+1);
		}
		return count;

	}

	private static int loopJ(int i, int j, int[][] a, int cnt, int counter, int k)
	{
		if(k<a.length)
		{
			if(a[i][k]<a[i][j])
				cnt++;
			return loopJ(i, j, a, cnt, counter, k+1);
		}
		return cnt;
	}

}
