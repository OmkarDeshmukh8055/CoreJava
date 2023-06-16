package zprePractice2;

import java.util.Arrays;

public class Swipping_Zero_Posi_Neg {

	public static void main(String[] args) {

		int a[]= {0,1,-2,0,3,-4,5,0,0,0};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(a[i]<0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		}
}
