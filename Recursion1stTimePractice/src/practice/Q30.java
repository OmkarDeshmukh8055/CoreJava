package practice;

import java.util.Arrays;

public class Q30 {
	static int a[]= {1,1,1,1,1,2,2,3,4};
	static int n[]= {1,2,4};
	public static void main(String[] args)
	{
		for (int i = 0; i < n.length; i++)
		{	
			int cnt=0;
			for (int j = 0; j < a.length; j++)
			{
				if(a[j]==n[i])
				{
					cnt++;
				}
			}
			System.out.println(cnt);

			if(cnt>2)
				cnt=2;
			int b[]=new int [a.length-cnt];
			int index=0;
			cnt=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(n[i]==a[j] && cnt<2)
				{
					cnt++;
				}
				else
					b[index++]=a[j];
			}
			a=b;
		}
			System.out.println(Arrays.toString(a));
	}
	

}
