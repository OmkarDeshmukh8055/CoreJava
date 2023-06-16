package array;

import java.util.Arrays;

public class maxOccrance {

	public static void main(String[] args) {

		String s="aaabbbbcc";
		String s1="";
		for (int i = 0; i <s.length(); i++) 
		{	
			int cnt=0;
			for (int j = i+1; j <s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					break;
				}
		
			}
			if(cnt==0)
				s1=s1+s.charAt(i); 
		} 
		System.out.println(s1);
		
		int []a=new int [s1.length()];
		for (int i = 0; i < s1.length(); i++) 
		{	
			int cnt=0;
			for (int j = 0; j < s.length(); j++)
			{
				if(s1.charAt(i)==s.charAt(j))
					cnt++;
			}
			a[i]=cnt;
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
