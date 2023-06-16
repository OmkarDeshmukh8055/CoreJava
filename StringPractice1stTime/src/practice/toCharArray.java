package practice;

import java.util.Arrays;

public class toCharArray {

	public static void main(String[] args) {

		String s1="omkar";
		char ch[]=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		char ch1[]=new char[s1.length()];
		for (int i = 0; i < s1.length(); i++)
		{
			ch1[i]=s1.charAt(i);
		} 
		for (int i = 0; i < ch1.length; i++)
		{
			System.out.println(ch[i]);
		}
	}

}
