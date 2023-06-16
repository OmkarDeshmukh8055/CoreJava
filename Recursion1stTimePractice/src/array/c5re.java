package array;

import java.util.Arrays;

public class c5re {
		static int a[]= {-1,2,3,-4,5,-6,7,-8};

	public static void main(String[] args)
	{
		loopI(0);
		System.out.println(Arrays.toString(a));
	}

	private static void loopI(int i) 
	{
		if(i<a.length)
		{	
			int j = i+1; 
			int temp=a[i];
			j=loopJ(i,j,temp);
				
			loopI(i+1);

		}
		}

	private static int loopJ(int i, int j, int temp)
	{
		if(j<a.length)
		{
			if(a[i]<0)
			{
				 temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			else
			{
				return temp;
			}
		return	loopJ(i, j+1, temp);
		}
		return temp;
	}

}
