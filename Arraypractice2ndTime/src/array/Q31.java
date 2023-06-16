package array;

import java.util.Arrays;

public class Q31 {

	public static void main(String[] args) {

		int a[]= {5,1,3,4,7};
			
			int sum=12;
			int count=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				for (int j2 = j+1; j2 < a.length; j2++)
				{
					if(a[i]+a[j]+a[j2]<sum)
					{	
						Arrays.sort(a);
						count++;
						System.out.println("("+a[i]+","+a[j]+","+a[j2]+")");
					}
				}
			}
		}
		System.out.println(count);
	}

}
