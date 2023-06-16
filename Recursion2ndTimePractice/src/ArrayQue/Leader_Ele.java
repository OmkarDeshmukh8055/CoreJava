package ArrayQue;

public class Leader_Ele {

	public static void main(String[] args) {
		int a[]= {11,22,33,4,5,3,7,1};
	
			leaderprint(a,0);
	}
	
		private static void leaderprint(int[] a, int i) 
		{
				if(i<a.length)
				{
					int j=i+1,cnt=0;
					cnt=loopJ(a,i,j,cnt);
					if(cnt==0)
					System.out.println(a[i]);
					leaderprint(a, i+1);
				}
		}
		private static int loopJ(int[] a, int i, int j, int cnt) {
			if(j<a.length)
			{
				if(a[i]<a[j])
				{
					cnt++;
				
				}
				return loopJ(a, i, j+1, cnt);
			}
			return cnt;
	}
}

