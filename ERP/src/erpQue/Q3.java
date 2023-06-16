package erpQue;

import java.util.Arrays;

public class Q3 {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,2,3,3};
		myCode(a);
	}
	//EndOfMainMethod

	private static void myCode(int[] a) 
	{
		System.out.println(Arrays.toString(a));
		int cnt=0;
		//WriteCode Here
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
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]!=b[j])
					b[j]=a[i];
			}
		}
		a=b;
		System.out.println(Arrays.toString(a));
	}
}

