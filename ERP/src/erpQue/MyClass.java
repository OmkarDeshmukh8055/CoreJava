package erpQue;

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			2,1,4,6,4,8,6
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[min]<a[j])
				{
					min=j;
				}
				int temp=a[min];
				a[min]=a[j];
				a[j]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
