package array;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
		
		int a[]= {99,1,2,12,3,5,7};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
