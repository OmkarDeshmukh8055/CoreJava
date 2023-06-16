package erpQue;

public class MinMaxdiff 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a=
		{
			11,22,33,44,55
		}
		;
		diff(a);
	}
	//EndOfMainMethod
	private static void diff(int[] a) 
	{
		//code here
		int max=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("max "+max);
		System.out.println("min "+min);
		System.out.println(max-min);
	}
}