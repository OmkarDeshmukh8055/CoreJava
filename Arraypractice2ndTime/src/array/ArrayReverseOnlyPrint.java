package array;

import java.util.Arrays;

public class ArrayReverseOnlyPrint {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7};

int j=a.length-1;
int i=0;

		for (int k =a.length-1;k>=0; k--)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
	
		
	//while(i<j)
	//{
	//	a[i]=a[i]+a[j]; 
	//	a[j]=a[i]-a[j];
	//	a[i]=a[i]-a[j];
	//	j--;
	//	i++;
	//}
		
		
/*
 * for (int i = 0; i < a.length/2; i++) 
 * { 
 * a[i]=a[i]+a[j]; 
 * a[j]=a[i]-a[j];
 * a[i]=a[i]-a[j]; j--; 
 * }
 */
		
	System.out.println(Arrays.toString(a));
	}

}
