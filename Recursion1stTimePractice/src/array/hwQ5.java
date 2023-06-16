package array;

import java.util.Arrays;

public class hwQ5 {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,0,21,22};
//		int j=a.length-1;
//		int i=0;
		
//			while(i<j)
//			{
//	
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			 
//			 j--;i++;
//			}
		
//		int j=a.length-1;	
//
//		for (int i= 0; i< a.length/2; i++)
//		{	
//				
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				
//				j--;
//			}
		
		
		
		
for (int i = 0; i < a.length; i++)
{
	for (int j = i; j < a.length; j++)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	
	}
}	
			System.out.println(Arrays.toString(a));
	}

}
