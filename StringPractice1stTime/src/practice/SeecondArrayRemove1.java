package practice;

import java.util.Arrays;

public class SeecondArrayRemove1 {

	public static void main(String[] args) {

		int a[]= {1,1,1,1,1,2,2,3,4};
		int  b[]= {1,2,4};
		
		int rank=0;
		for (int i = 0; i < a.length; i++)
		{				
			int cnt=0;
			for (int j = i; j < a.length; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			boolean sp=false;
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
					sp=true;
				
			}
			if(cnt>2 && sp==true|| sp==false)
				rank++;
		}
		System.out.println(rank);
		
		int c[]=new int[rank];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{				
			int cnt=0;
			for (int j = i; j < a.length; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			boolean sp=false;
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
					sp=true;
				
			}
			if(cnt>2 && sp==true|| sp==false)
				c[index++]=a[i];
		}
		System.out.println(Arrays.toString(c));

	}

}
