package zprePractice4;

import java.util.Arrays;
import java.util.Scanner;

public class Q32Array {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
		int a[]=new int [10];
		System.out.println("enter element");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
 //int a[]= {12,-99,44,-22,0,54,-2};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<0 )
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
			if(a[i]<0 && a[i]%2==0)
				System.out.println("negative && even "+a[i]);
			else if(a[i]<0 && a[i]%2!=0)
				System.out.println("negative && odd "+a[i]);
			if(a[i]>=0 && a[i]%2==0)
				System.out.println("possitive && even "+a[i]);
			else if(a[i]>0 && a[i]%2!=0)
				System.out.println("possitive && odd "+a[i]);
		}
		
			
		System.out.println(Arrays.toString(a));
	}

}
