package string;

public class pattern {

	public static void main(String[] args) {
		
		int count=1;
		loopI(count,0);
	
	}

	private static void loopI(int count, int i)
	{
		if(i<5)
		{
			int cnt=count;
			int diff=4;
			loopJ(cnt,count,diff,i,0);
			for (int j = 0; j < 5; j++) 
			{
				
			}
			count++;
			System.out.println();
			loopI(count, i+1);
		}
	}

	private static void loopJ(int cnt,int count, int diff, int i,int j)
	{
		if(j<5)
		{
			if(j-i<=0)
				System.out.print(cnt+" ");
				cnt=cnt+diff;
				diff--;
				loopJ(cnt, count, diff, i, j+1);
		}
	}

}
