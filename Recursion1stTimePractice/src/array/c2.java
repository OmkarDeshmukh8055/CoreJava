package array;

import java.util.Arrays;

public class c2 {

	public static void main(String[] args) {

		int a[]={9,5,1,4,3,2};
		int i=0;
		
		while(i<a.length)
		{
			int j=i+1;

			while(j<a.length)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(a));
		int start=0;
		int end=a.length-1;
		int num=5;

		while(true)
		{
			int mid=(start+end)/2;

			if(a[mid]==num)
			{
				System.out.println("found at index "+mid);
				break;
			}
			else if(a[mid]<num)
				start=mid+1;
			else
				end=mid-1;
			if(start>end)
			{
				System.out.println("not found");
				break;
			}
		}
		
	}

}
