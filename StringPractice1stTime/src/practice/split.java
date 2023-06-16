package practice;

import java.util.Arrays;

public class split {

	public static void main(String[] args) {
		String s1="String is an object ?";
		String sa[]=s1.split(" ");
		
		for (int i = 0; i < sa.length; i++)
		{
			System.out.println(sa[i]);
		}
		
		System.out.println("Implimentation");
		int cnt=0;
	for (int i = 0; i < s1.length(); i++)
	{
		if(s1.charAt(i)==' ')
			cnt++;
	}
	String sa1[]=new String [cnt+1];
	int index=0;
	String sp="";
	for (int i = 0; i < s1.length(); i++)
	{	
	
		if(s1.charAt(i)==' '&& s1.charAt(i+1)!=' ')
		{
			sa1[index++]=sp;
			sp="";
		}
	
			else
		{
			if(s1.charAt(i)!=' ')
			{
			sp=sp+s1.charAt(i);
			}
		}
		if(i==s1.length()-1)
		{
			sa1[index++]=sp;

		}

		
			
	}
		for (int i = 0; i < sa1.length; i++) 
		{
			System.out.println(sa1[i]);
		}
	}

}
