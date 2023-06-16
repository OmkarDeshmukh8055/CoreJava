package StringTestPracticeOct16;

import java.util.Arrays;
import java.util.Iterator;

public class q3 {

	public static void main(String[] args) {

		String s = "aaabbcc";
		String s1 = "";
		//int max = Integer.MIN_VALUE;

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s1.length(); j++) {
				if (s.charAt(i) == s1.charAt(j))
					count++;
			}
			if (count == 0)
				s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
		
		;
		char ca[]=s1.toCharArray();
		int ia[]=new int[ca.length];
		
		for (int i = 0; i < ca.length; i++) 
		{
			int count1=0;
			for (int j =0; j < s.length(); j++) 
			{
				if(s.charAt(j)==ca[i])
					count1++;	
			}
			ia[i]=count1;
			
		}
		System.out.println(Arrays.toString(ia));
		
		for (int i = 0; i < ia.length; i++) 
		{  
	
			for (int j = i+1; j < ia.length; j++) 
			{
				if(ia[i]>ia[j])
				{
					int temp=ia[i];
				ia[i]=ia[j];
				ia[j]=temp;
				
				 char temp1=ca[i];
				ca[i]=ca[j];
				ca[j]=temp1;
				}
							
			}
		}
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.print(ca[i]+" "); 
		}
		System.out.println();
			for (int i = 0; i < ia.length; i++) 
			{
				System.out.print(ia[i]+" ");
			}
			System.out.println();
			System.out.println(ca[2]+" "+ia[2]);
				

	}
}
