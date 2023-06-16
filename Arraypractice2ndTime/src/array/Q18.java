package array;

import java.util.Arrays;

public class Q18 {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,7,8,0,4};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]%2!=0 && a[j]%2==0)
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
