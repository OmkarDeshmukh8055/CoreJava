package array;

import java.util.Arrays;

public class Harshadanu {

	public static void main(String[] args)
	{
		int n[]= {1,2,4};
		int a[]= {1,1,1,1,1,2,2,3,4};
		for (int i = 0; i < n.length; i++) 
		{
			int count=0;

			for (int j = 0; j < a.length; j++)
			{
				if(a[j]==n[i])
					count++;
			}
			if(count>2)
				count=2;
		int[] newA=new int [a.length-count];
		int index=0;
		 count=0;
		for (int j = 0; j < a.length; j++)
		{
			if(a[j]==n[i] && count<2)
			{
				count++;
			}
			else
			{
				newA[index++]=a[j];
			}
				
		}
		a=newA;
		}
		System.out.println(Arrays.toString(a));
	}
}
