package array;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayRemove1to1 {

	public static void main(String[] args) {

		int a[]= {1,1,1,1,1,2,2,3,4};
		int b[]= {1,1,2,4};
	 		int rank=0;
	 		for (int i = 0; i < a.length; i++)
	 		{	
	 			int cnt=0;
	 			for (int j = i; j < a.length; j++)
	 			{
					if(a[i]==a[j])
						cnt++;
				}
			
	 		boolean p=false;
	 		for (int j = 0; j < b.length; j++)
	 		{
				if(a[i]==b[j])
					p=true;
					
			}
	 		if(cnt>2 && p==true || p==false)
	 			rank++;
	 		}
	 		int c[]=new int [rank];
	 		int index=0;
	 		
	 		for (int i = 0; i < a.length; i++)
	 		{	
	 			int cnt=0;
	 			for (int j = i; j < a.length; j++)
	 			{
					if(a[i]==a[j])
						cnt++;
				}
			
	 		boolean p=false;
	 		for (int j = 0; j < b.length; j++)
	 		{
				if(a[i]==b[j])
					p=true;
					
			}
	 		if(cnt>2 && p==true || p==false)
	 			c[index++]=a[i];
	 		}
	 	
for (int i = 0; i < c.length; i++)
{
	System.out.print(c[i]+" ");
}	
}

}
