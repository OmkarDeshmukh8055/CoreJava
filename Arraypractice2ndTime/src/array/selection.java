package array;

import java.util.Arrays;

public class selection {

	public static void main(String[] args) {
		int a[]= {2,1,4,6,4,8,6};
		
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
		System.out.println(Arrays.toString(a));
	}

}
