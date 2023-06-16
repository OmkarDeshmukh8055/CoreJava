package array;

import java.util.Arrays;

public class c3 {

	public static void main(String[] args) {
		//selection sort
		int a[]= {1,2,9,7,6,3};
		
//		for (int i = 0; i < a.length; i++)
//		{	
//			int min=i;
//			for (int j = i+1; j < a.length; j++)
//			{
//				if(a[min]>a[j])
//				{
//					min=j;
//				}
//			}
//			 int temp=a[i];
//			 a[i]=a[min];
//			 a[min]=temp;
//		}
		loopI(a,0);
		System.out.println(Arrays.toString(a));
	}

	private static void loopI(int[] a, int i) {

		if(i<a.length)
		{
			int min=i;
			int j=i+1;
			j=loopJ(j,i,a,min);
			 int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			loopI(a,i+1);
		}
	}

	private static int loopJ(int j, int i, int[] a, int min) {
		if(j<a.length)
		{
			if(a[min]>a[j])
			{
				min=j;
			}
			else
			{
				return min;
			}
			
		return	loopJ(j+1, i, a, min);
		}
		return min;
		
	}

}
