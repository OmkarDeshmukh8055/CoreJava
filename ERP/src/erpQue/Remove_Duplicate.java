package erpQue;

import java.util.Arrays;

public class Remove_Duplicate
{

	// StartOfMainMethod
	public static void main(String[] args)
	{
		int[] a = { 1, 11, 1, 1, 1, 1, 22, 3, 3, 3, 3, 2, 2, 21 };
		myCode(a);
	}
	// EndOfMainMethod
	private static void myCode(int[] a)
	{
		// WriteCode Here
		int cnt = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i +1; j < a.length; j++) 
			{
				if (a[i] == a[j])
				{
					cnt++;
					break;
				}
			}
		}
		int b[] = new int[a.length - cnt];
		int index = 0;
		for (int i = 0; i < a.length; i++)
		{
			int cnt1 = 0;
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i]== b[j]) 
				{
					cnt1++;
				}
			}
			if (cnt1 == 0)
				b[index++] = a[i];
		}
for (int i = 0; i < b.length; i++) {
	System.out.print(b[i]+" ");
	
}	}
}
