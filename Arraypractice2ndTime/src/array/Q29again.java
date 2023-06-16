package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q29again {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int [5];
			int index=0;
			int num;
			int sum=0;
			boolean repeted=true;
		for (int i = 0; i < a.length; i++) 
		{				a[index++]=num=sc.nextInt();

			for(int j=0;j<index-1;j++)
			{
				if(a[j]==num)
				{
					System.out.println(num +" is repeted");
					repeted=false;
					break;
					
				}
				if(repeted==false)
				{
					break;
				}
			}
			if(repeted==false)
			{
				break;
			}
			else	
			{
			sum=sum+num;
			}

			
		}
		System.out.println(Arrays.toString(a));
		if(repeted==true)
		System.out.println("sum "+sum);
	}

}
