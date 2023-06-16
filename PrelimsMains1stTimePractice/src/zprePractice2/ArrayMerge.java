package zprePractice2;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {

		int a[]= {1,3,5,7,9};
		int b[]= {0,2,4,6,8};
		
		int c[]=new int [a.length+b.length];
		int index=0;
		
		for (int i = 0; i < c.length; i++) 
		{
			if(i<a.length)
				c[index++]=a[i];
			if(i<b.length)
				c[index++]=b[i];
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}

}
