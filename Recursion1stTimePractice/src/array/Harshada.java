package array;

import java.util.Arrays;

public class Harshada {
	static int a[]= {1,1,1,1,1,2,2,3,4};
	static int b[]= {1,2,4};
	public static void main(String[] args) {

		
		
		int cnt=0;
		for (int i = 0; i < a.length; i++)
		{	
			boolean dup=true;
			
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
				{
					dup=false;
					break;
				}
			}
			int count=0;
			for (int j = 0; j <i; j++)
			{
				if(a[j]==a[i])
				{
					count++;
				}
			}
			if(dup|| count>=2)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		
		int ia[]=new int [cnt];
		int index=0;
		int count=0;
		for (int i = 0; i < a.length; i++)
		{	
			boolean dup=true;
			
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j])
				{
					dup=false;
					break;
				}
			}
			int counter=0;
			for (int j = 0; j <i; j++)
			{
				if(a[j]==a[i])
				{
					counter++;
				}
			}
			if(dup|| counter>=2)
			{
				ia[index++]=a[i];
			}
		}
		System.out.println(Arrays.toString(ia));
	}
	

}
