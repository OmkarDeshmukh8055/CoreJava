package array;

import java.util.Arrays;

public class ArraySortClass {

	public static void main(String[] args) {

		int a[] = { 11, 9, 8, 2, 3, 5, 6, 7 };
		System.out.println("Before Sort");
		System.out.println(Arrays.toString(a));


		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if( a[i]>a[j]) 
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println("after Sort");

		System.out.println(Arrays.toString(a));
	}

}
