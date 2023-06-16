package array;

import java.util.Arrays;
import java.util.Iterator;

public class reInsertionSort {

	public static void main(String[] args) {
		
		int a[]= {1,9,8,2,5,4,0};
		
//		for (int i = 1; i < a.length; i++)
//		{	
//			int temp=a[i];
//			int j = i;
//			for (; j >0; j--)
//			{
//				if(temp<a[j-1])
//					a[j]=a[j-1];
//				else
//					break;
//			}
//			a[j]=temp;
//		}
//		System.out.println(Arrays.toString(a));
//		
		int i=1; 
		loopI(i,a);
		System.out.println(Arrays.toString(a));
	}

	private static void loopI(int i,int[] a)
	{	
		if(i<a.length)
		{
			int temp=a[i];
			 int j = i;
			j= loopj(a,i,j,temp);
			a[j]=temp;

				loopI(i+1,a);

	   }
		

	}

	private static int loopj(int[] a, int i, int j, int temp) {
		if(j>0)
		{
			if(temp<a[j-1])
				a[j]=a[j-1];
			else
				return j;
			j--;
			return loopj(a, i, j, temp);
		}
		return j;
		
	}

}
