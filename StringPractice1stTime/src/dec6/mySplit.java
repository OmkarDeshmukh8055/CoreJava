package dec6;

import java.util.Arrays;

public class mySplit {

	public static void main(String[] args) {
		//class 

		String s = "om      kar";
				
				String ch[]=s.split(" "); 
				for (int i = 0; i < ch.length; i++)
				{
					System.out.println(ch[i]);
				}
				System.out.println();
		int cnt = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ' ')
			{
				cnt++;
			}
		}
		String []sa=new String[cnt+1];
		
		int index=0;
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				sa[index++]=s1;
				s1="";
			}
			else
			{
				s1=s1+s.charAt(i);
			}
			if(i==s.length()-1)
			{
				sa[index++]=s1;
			}
		}
//		for (int i = 0; i < sa.length; i++)
//		{
//			System.out.println(sa[i]); 
//		}

	}

}
