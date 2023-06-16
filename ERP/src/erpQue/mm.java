package erpQue;

import java.util.Arrays;

public class mm {
	// StartOfMainMethod
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int index = 0;
		int[] b = new int[a.length];
		evenodd(a,index,  b);
	}// EndOfMainMethod

	private static void evenodd(int[] a,int index, int[] b) {

		// code here

		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				b[index++]=a[i];
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2!=0)
				b[index++]=a[i];
		}
	System.out.println(Arrays.toString(b));
	}

}
