package array;

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {

		int a[]= {1,9,2,6,5,8,3,0};
		
		for (int i = 1; i < a.length; i++)
		{	int temp=a[i];
			int j = i;
			for (; j >0; j--) 
			{
				if(a[j-1]>temp)
				{
					a[j]=a[j-1];
				}
				else
				{
					break;
				}
			}
		
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}