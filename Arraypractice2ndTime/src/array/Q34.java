package array;

import java.util.Arrays;

public class Q34 {

	public static void main(String[] args) {

		int a[]= {1,1,1,-1,-11,1,1,1,-12,-14,-2,-12};
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]<0)
			{
				for (int j = i+1; j < a.length; j++) 
				{
					if(a[j]>0)
					{
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
