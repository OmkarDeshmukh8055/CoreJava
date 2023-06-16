package arrayRecursion;

import java.util.Arrays;

public class removeDuplicate {

	public static void main(String[] args) {

		int a[]= {1,2,3,2,3,4,5};
		
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
				cnt++;
				break;
				}
			}
			
		}
		
		int b[]=new int [a.length-cnt];
			int index=0;
		for (int i = 0; i < a.length; i++)
		{	
			int countb=0;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					countb++;
					break;
				}
			}
			if(countb==0)
			{
				b[index++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		
		
		int counter=0;
		int b1=i(a,0,counter);
		System.out.println(b1);
		//int b[]=new int [a.length-b];

	}

	private static int i(int[] a, int i, int counter) {

		if(i<a.length)
		{
			int j=0;
			return j(a,i,counter,j=i+1);
		}
		return counter;
	}

	private static int j(int[] a, int i, int j, int counter) {

		if(j<a.length)
		{
			if(a[i]==a[j])
			{
				counter++;
			}
		}
		return counter;
	}

}
