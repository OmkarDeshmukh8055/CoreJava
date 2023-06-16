package array;

import java.util.Arrays;

public class Exam27 {

	public static void main(String[] args) {

int a[]= {1,2,3,4,5,6,7};

for (int i = 0; i < a.length; i++)
{
	for (int j = 0; j < a.length; j++) {
		
	
	if(j>i)
	{
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
	}
	}
}
System.out.println(Arrays.toString(a));
	}

}
