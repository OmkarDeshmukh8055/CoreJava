package zprePractice4;

import java.util.Arrays;

public class Q35_Array {

	public static void main(String[] args) {

		int a[]= {11,-1,66,-2,-4,5};
		int i=0;
		int j=i+1;
		while(i<a.length-1)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			j--;
			i++;
		}
		System.out.println(Arrays.toString(a));
//		for (int i = 0; i < a.length; i++)
//		{	
//			int sum=0;
//			for (int j = i+1; j <=3; j++) 
//			{
//				for (int k = j+1; k < a.length; k++)
//				{
//					if(a[i]+a[j]+a[k]==2)
//					{
//						System.out.println(a[i]+" "+a[j]+" "+a[k]);
//	
//					}
//				}
//			}
//		}
		
	}

}
