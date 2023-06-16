
package ArrayQue;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,4,3,2,3,2,3,2};
		int cnt=0;
		cnt=duplicate(a,0,cnt);
		
		int b[]=new int[a.length-cnt];
		int index=0;
		
		newArray(a,0,b,index);
		
		print(b,0);
	}
		private static void print(int[] b, int i) 
		{
				if(i<b.length)
				{
					System.out.println(b[i]);
					print(b, i+1);
				}
		}

	private static void newArray(int[] a,int i, int[] b, int index) 
	{	
		if(i<a.length)
		{
			int cnt1=0;
			
			int j=i+1;
			cnt1=DupCnt(a,i,j,cnt1);
				if(cnt1==0)
					b[index++]=a[i];
				 newArray(a, i+1, b, index);
		}
		
	}

	private static int DupCnt(int[] a, int i, int j, int cnt1) {
		if(j<a.length)
		{
			if(a[i]==a[j])
			{
				cnt1++;
			
			}
			return DupCnt(a, i, j+1, cnt1);
		}
		return cnt1;
	}

	private static int duplicate(int[] a, int i, int cnt)
	{
		if(i<a.length)
		{
			
			int j=i+1;
			cnt =loopJ(a,i,j,cnt);
			return duplicate(a, i+1, cnt);
		}
		return cnt;
	}

	private static int loopJ(int[] a, int i, int j, int cnt) {
		if(j<a.length)
		{
			if(a[i]==a[j])
			{
				cnt++;
				return cnt;
			}
		return	loopJ(a, i, j+1, cnt);
		}
		return cnt;
	}

}
