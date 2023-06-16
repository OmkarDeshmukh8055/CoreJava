package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element");
		int n[]=new int [5];
		int index=0;
		boolean c=true;
		int b=0;
		int sum=0;
		for (int i = 0; i < n.length; i++) 
		{
			int a=sc.nextInt();
			boolean x=true;
			for (int j = 0; j < b; j++) 
			{
				if(a==n[j])
				{x=false;
				c=false;
				break;
				}
				
					
			}
			if(x)
			{
			n[index++]=a;
			sum=sum+n[i];
			b++;
			}
			else
			{
				System.out.println("element repted");
				break;
			}
		}
		
		System.out.println(Arrays.toString(n));
		if(c)
		{
		System.out.println("sum of element "+sum);
		}
	}

}
