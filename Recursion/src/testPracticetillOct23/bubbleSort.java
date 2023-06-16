package testPracticetillOct23;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

int a[]= {1,2,9,8,4,7,5,3,6};

for (int i = 0; i < a.length; i++) 
{
	for (int j = 0; j < a.length-1; j++)
	{ 
		if(a[j]>a[j+1])
		{
			int temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
			
		}
	}	
	
}
	
System.out.println(Arrays.toString(a));
	}

}
