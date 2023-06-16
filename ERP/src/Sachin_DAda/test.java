package Sachin_DAda;

import java.util.Scanner;

public class test {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=6;
		int [] s= {2,4,5,6,8,10};
//		for (int i = 0; i < s.length; i++) 
//		{
//			s[i]=sc.nextInt();
//		}
		int k=2;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i]%k==0)
			{
				if(s[i]<min)
					min=s[i];
			}
		}
		int max2=Integer.MAX_VALUE;
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i]%k==0)
			{
				if(s[i]!=min
						&& s[i]<max2)
					max2=s[i];
			}
		}
System.out.println(max2);
	}

}
