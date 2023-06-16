package dec6;

import java.util.Arrays;

public class split {

	public static void main(String[] args) {

		String s="omkar Abasaheb deshmukh";
		
		String sa[]=s.split(" ");
		
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}
		System.out.println();
		System.out.println();
			int cnt=0;
			for (int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i)==' ')
					cnt++;
			}
			String ch[]=new String[cnt+1];
			int index=0;
			String s1="";
			for (int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i)==' ')
				{
					ch[index++]=s1;
					s1="";
				}
				if(s.charAt(i)!=' ')
				{
					s1=s1+s.charAt(i);
				}
				if(i==s.length()-1)
				{
					ch[index++]=s1;
				}
			}
			for (int i = 0; i < ch.length; i++) 
			{
				System.out.println(ch[i]);
			}

	}

}
