package practice;

import java.util.Arrays;
public class harshada {
	public static void main(String[] args)
	{
		 int a[]= {1,1,1,1,1,2,2,3,4};
		 int b[]= {1,2,4};

		a=loopI(a,b,0);
		System.out.println(Arrays.toString(a));
	}

	private static int[] loopI(int[] a, int[] b, int i)
	{
		if(i<b.length)
		{
			
			int cnt=0;
			cnt=loopJ(cnt,a,b,i,0);
			if(cnt>2)
				cnt=2;
		 int c[]=new int[a.length-cnt];
		 int index=0;
		 cnt=0;
		 c=loopB(c,index,a,b,cnt,i,0);
		 a=c;
	return	loopI(a, b, i+1);
		}
		return a;
	}

	private static int[] loopB(int[] c, int index, int[] a, int[] b, int cnt, int i, int j)
	{	
		if(j<a.length)
		{
			if(a[j]==b[i] && cnt<2)
			{
				cnt++;
			}
			else
			{
				c[index++]=a[j];
			}
			return loopB(c, index, a, b, cnt, i, j+1);
		}
		return c;
	}

	private static int loopJ(int cnt, int[] a, int[] b, int i, int j)
	{
		if(j<a.length)
		{
			if(a[j]==b[i])
				cnt++;
		return loopJ(cnt, a, b, i, j+1);
		}
		return cnt;
	}

	

}
