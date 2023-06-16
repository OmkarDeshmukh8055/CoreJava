package array;

import java.util.Arrays;

public class c4 {

	public static void main(String[] args) {
		int a[]= {11,2,3,0,9,4,5};
		
		for (int i = 1; i < a.length; i++)
		{
				int temp=a[i];
				int j =i;
			for (; j >0; j--)
			{
				if(temp<a[j-1])
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
