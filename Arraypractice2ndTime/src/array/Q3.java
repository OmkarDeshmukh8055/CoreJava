package array;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {

int a[]= {1,2,3,4,4};
	int num=4;
	int cnt=0;
	for (int i = 0; i < a.length; i++)
	{
		if(a[i]==num)
			cnt++;
	}
	
	int index=0;
	int b[]=new int[a.length-cnt];
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
