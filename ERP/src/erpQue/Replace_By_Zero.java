package erpQue;

import java.util.Arrays;

public class Replace_By_Zero 
{
	public static void main(String[] args) 
	{
		int a[] = { 1, 2, 3, 4, 5, 6, 67, 7, 8, -12, -4, 9 };
		a = replace(a, 0);
		System.out.println(Arrays.toString(a));
	}

	private static int[] replace(int[] a, int i) 
	{
		if (i < a.length) 
		{
			if (a[i] % 2 == 0)
				a[i] = 0;
			return replace(a, i + 1);
		}
		return a;
	}
}
