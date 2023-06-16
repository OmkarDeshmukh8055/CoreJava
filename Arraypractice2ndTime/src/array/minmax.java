package array;

import java.util.Arrays;

public class minmax {

	public static void main(String[] args) {

		int a[]= {21,32,6,11};
		Arrays.sort(a);;
		System.out.println(Arrays.toString(a));
		int max=	Integer.MIN_VALUE;	
		int max2=	Integer.MIN_VALUE;	

		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max )
			{
				max=a[i];
			}
			if(a[i]<min )
			{
				min=a[i];
			}
			
		}

		System.out.println(max);
		System.out.println(min);

	}

}
