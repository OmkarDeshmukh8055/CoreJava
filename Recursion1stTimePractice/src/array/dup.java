package array;

import java.util.Arrays;

public class dup {

	public static void main(String[] args) {

		int a[] = { 1, 1, 1, 1, 2 };
		int count = 0;
		count = loopI(0, a, count);
		int b[] = new int[a.length - count];
		int index = 0;
		
		loopI1(0,a,b,index);
		print(0,b);
			}

	private static void print(int i, int[] b)
	{
		if(i<b.length)
		{
			loopJ(i,b,0);
			print(i+1,b);
		}
	}

	private static void loopJ(int i, int[] b, int j)
	{
		if(j<b.length)
		{
			System.out.println(b[i]+" "+b[j]);
			loopJ(i, b, j+1);
		}
	}

	private static void loopI1(int i, int[] a, int[] b, int index)
	{
		if(i<a.length)
		{

			boolean dup = true;
			dup=loopJ(a,b,i,dup,0);
			
			if (dup)
				b[index++] = a[i];
		loopI1(i+1, a, b, index);
		}
	}

	private static boolean loopJ(int[] a, int[] b, int i, boolean dup, int j)
	{
		if(j<b.length)
		{

			if (a[i] == b[j])
			{
				dup = false;
				return dup;
			}
			return loopJ(a, b, i, dup, j+1);
		}
		return dup;
	}

	private static int loopI(int i, int[] a, int count)
	{
		if (i < a.length)
		{
			int j = i + 1;
				
				count=loopJ(a,i,j,count);
			return loopI(i + 1, a, count);
		}
		return count;
	}

	private static int loopJ(int[] a, int i, int j, int count)
	{
		if(j<a.length)
		{
			if(a[i]==a[j])
			{
				count++;
			return count;
			}
			return loopJ(a, i, j+1, count);
		}
		return count;
	}

}
