package practice;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args)
	{
		String s="omkar Deshmukh";
		String []sa=s.split(" ");
		String s1="";
		for (int i = sa.length-1;i>=0; i--) 
		{
			s1=s1+sa[i]+" ";
		}
		s=s1;
		System.out.println(s);
	}

	

}
