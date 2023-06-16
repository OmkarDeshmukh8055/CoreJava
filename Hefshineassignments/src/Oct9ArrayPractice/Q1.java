package Oct9ArrayPractice;

import java.util.Arrays;

public class Q1
{

	public static void main(String[] args)
	{
int []a= {1,3,7,6,5,4,9,8,2};

for (int i = 0; i < a.length; i++) 
{
	int temp=a[i];
	int start=0;
	for (int j = i-1; j >=0; j--)
	{
		if(a[j]<temp)
		{
			a[j+1]=start;
				break;
		}
		for (int j2 = i-1; j2 >=start; j2--) 
		{
		  a[j+1]=a[j];
				  
		}
		a[start]=temp;
	}
}
	//System.out.println(Arrays.toString(a));
for (int i = 0; i < a.length; i++) 
{
	System.out.println(a[i]);
}

	}

}
