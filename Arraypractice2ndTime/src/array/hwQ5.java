package array;

import java.util.Arrays;

public class hwQ5 {

	public static void main(String[] args) {

 int a[]= {1,2,3,4,5};
 int j=a.length-1;
 	for (int i = 0; i < a.length/2; i++)
 	{  
 		a[i]=a[i]+a[j];
 		a[j]=a[i]-a[j];
 		a[i]=a[i]-a[j];

 		j--;
 	}
	
 	System.out.println(Arrays.toString(a));
	}

}
