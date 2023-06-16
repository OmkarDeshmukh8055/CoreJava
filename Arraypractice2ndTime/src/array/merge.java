package array;

import java.util.Arrays;

public class merge {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6};
		int b[]= {9,8,7,};
		int c[]=new int [a.length+b.length];
		int index =0;
		for (int i = 0; i < c.length; i++) 
		{ 
			if(i<a.length)
			c[index++]=a[i];
			if(i<b.length)

			c[index++]=b[i];
			
		}
		for (int i = 0; i < c.length; i++) 
		{ 
			for (int j = i+1; j < c.length; j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(c));
		}

}
