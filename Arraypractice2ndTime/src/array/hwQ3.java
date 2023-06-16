package array;

import java.util.Arrays;

public class hwQ3 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,7,4,5};
		int b[]=new int[a.length-1];
		int index=0;
		int num=2;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=num)
			{
				b[index++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		
	}

}
