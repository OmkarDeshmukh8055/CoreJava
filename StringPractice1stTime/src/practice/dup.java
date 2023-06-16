package practice;

import java.util.Arrays;

public class dup {
	
	public static void main (String [] args)
	{
		char  a[]={'a','a','a','b','b'};
		String s="";
		int dup=0;
		for(int i=0; i<a.length; i++)
		{	
			int cnt=0;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					dup++;
					break;
				}
			}
			if(cnt==0)
			{
				System.out.print(a[i]);
			s=s+a[i];
			}			
		}
		System.out.println();

		System.out.println("String : "+s);
		int o[]=new int [a.length-dup];
		int index=0;
		System.out.println(o.length);
		for(int i=0; i<s.length(); i++)
		{	
			int cnt=0;

			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			o[index++]=cnt;
		}
		System.out.println(Arrays.toString(o));
	}
}



