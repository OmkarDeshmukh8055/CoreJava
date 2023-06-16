package zprePractice4;

import java.util.Arrays;

public class Harshada_Number {

	public static void main(String[] args) {
		
		int a[]= {1,1,1,1,1,2,2,3,4};
		int b[]= {1,2,3};
		
		for (int i = 0; i < b.length; i++)
		{	
			int cnt=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(b[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt>2)
			{
				cnt=2;
			}
			
			int c[]=new int[a.length-cnt];
			int index=0;
				  cnt=0;
				for (int j = 0; j < a.length; j++) 
				{
					if(a[j]==b[i] && cnt<2)
					{
						cnt++;
					}
					else
					{
					c[index++]=a[j];
					}
				}
				a=c;
		}
		System.out.println(Arrays.toString(a));
	}

}
