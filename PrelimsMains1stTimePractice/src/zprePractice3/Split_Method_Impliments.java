package zprePractice3;

import java.util.Arrays;

public class Split_Method_Impliments {

	public static void main(String[] args)
	{
		String s="Om deshmukh";
		int cnt=0;
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)==' ')
				cnt++;
		}
		String sa[]=new String[cnt+1];
		int saIndex=0;
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{	
			if(s.charAt(i)==' ')
			{
				sa[saIndex++]=s1;
				s1="";
			}
			else
			{
				s1=s1+s.charAt(i);
			}
			if(i==s.length()-1)
			{
				sa[saIndex]=s1;
			}
			
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}
	}
}
