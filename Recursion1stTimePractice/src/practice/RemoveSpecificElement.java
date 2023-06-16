package practice;

import java.util.Arrays;

public class RemoveSpecificElement {

	public static void main(String[] args) {

		int a[]= {1,2,3,5,4};
		int num=5;
		int index=0;
		int b[]=new int [a.length-1];
		b=remove(a,b,num,0,index);
		System.out.println(Arrays.toString(b));
	}

	private static int[] remove(int[] a, int[] b, int num, int i,int index)
	{	
		if(i<a.length)
		{
			if(a[i]!=num)
				b[index++]=a[i];
		return	remove(a, b, num, i+1,index);
		}
		return b;
	}

}
