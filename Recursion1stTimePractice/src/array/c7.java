package array;

import java.util.Arrays;

public class c7 {
	static 		int a[]= {1,2,2};
	 static int cnt=0;

	public static void main(String[] args)
	{
		for (int i = 0; i < a.length; i++)
		{	
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					break;
				}
			}
		}
		int b[]=new int [a.length-cnt];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{		
			boolean noDup=true;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[j]==a[i])
				{
					noDup=false;
					break;
				}
			}
			if(noDup)
			{
				b[index++]=a[i];
			}
		}
		a=b;
	System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j =0; j < a.length; j++) 
			{	
				System.out.println(a[i]+" "+a[j]);
			}
		}
		
	}

}
