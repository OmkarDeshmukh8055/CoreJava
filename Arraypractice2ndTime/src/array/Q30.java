package array;

import java.util.Arrays;

public class Q30 {

	public static void main(String[] args) {

		int a[] = { 1, 1, 1, 1, 1, 2, 2, 3, 4 };
		int b[] = { 1,2, 4 };
		
		int cnt = 0;
		for (int i = 0; i < a.length; i++)
		{		
			boolean dup=true;
			for (int j = 0; j < b.length; j++)
			{
				if ( a[i]==b[j])
				{
					dup=false;
					break;
				}
			}
				int c=0;
				for (int k = 0; k < i; k++) 
				{
					if(a[i]==a[k])
						c++;
			    }
				if(dup || c>=2)
 					cnt++;
//				if(c>=2)
//					cnt++;
		}
		System.out.println("Duplicate  "+cnt);
		int c[]=new int [cnt];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			boolean dup=true;
			for (int j = 0; j < b.length; j++)
			{
				if (b[j]==a[i])
				{
					dup=false;
					break;
				}
			}
				int c1=0;
				for (int k = 0; k < i; k++) 
				{
					if(a[k]==a[i])
						c1++;
			    }
				if(dup ||c1>=2)
					c[index++]=a[i];
		}
		System.out.println(Arrays.toString(c));
	}
}
