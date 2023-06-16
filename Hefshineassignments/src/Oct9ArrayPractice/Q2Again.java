package Oct9ArrayPractice;

import java.util.Arrays;

public class Q2Again 
{

	public static void main(String[] args) 
	{
		int []a= {1,4,6,2,7,8,9,0,5,3};
		
	for (int i = 0; i < a.length; i++) 
	{
		int temp=a[i];
		int start=0;
		for (int j = i-1; j >=0; j--)
		{
			if(a[j]<temp) 
			{
				start=j+1;
			break;
			}
			
		}
		for (int j = i-1; j >=start; j--) 
		{
		a[j+1]=a[j];
			{
				a[j+1]=a[j];
			}
		}
		a[start]=temp;
	}	
	for (int i = 0; i < a.length; i++) 
	{
		System.out.println(a[i]);
	}
	}

}
