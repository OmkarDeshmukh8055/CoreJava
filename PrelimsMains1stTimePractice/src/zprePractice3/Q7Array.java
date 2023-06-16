package zprePractice3;

import java.util.Arrays;

public class Q7Array {

	public static void main(String[] args) {
		
		int a[]= {1,1,1,1,2};
		
		int cnt=0;
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
		int b[]=new int[a.length-cnt];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{	
			int cnt1=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					cnt1++;
				}
			}
			if(cnt1==0)
				b[index++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
