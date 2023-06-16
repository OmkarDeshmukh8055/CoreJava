package dec6;

import java.util.Arrays;

public class toLowerCase {

	public static void main(String[] args) {

		String s="ABCxyz";
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				s1=s1+(char)(ch-36);
			}
			else
				s1=s1+ch;
		}
		System.out.println(s1);
	}

}
