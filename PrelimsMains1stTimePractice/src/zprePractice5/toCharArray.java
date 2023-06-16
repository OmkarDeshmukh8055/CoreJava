package zprePractice5;

import java.util.Arrays;

public class toCharArray {

	public static void main(String[] args) {

		String s="omkar ";
		
		char ch[]=new char[s.length()];
		for (int i = 0; i < ch.length; i++)
		{
			ch[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
	}

}
