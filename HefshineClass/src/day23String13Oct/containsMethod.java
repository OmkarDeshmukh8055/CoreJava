package day23String13Oct;

import java.util.Iterator;

public class containsMethod 
{
static String s1="rjrkjerkjer";
static String s2="rj";
	public static void main(String[] args) 
	{

		 boolean result1=s1.contains(s2);
		 System.out.println(result1);
		 boolean result2=myContains();
		 System.out.println(result2);
	}
	private static boolean myContains()
    {
	if(s2.length()>s1.length())
	
		return false;
	for (int i = 0; i <s1.length(); i++) 
	{
		if(s2.charAt(0)==s1.charAt(i))
		{
			int s1index=i;
		int s2index=0;
		int count=0;
		while(s1index<s1.length() && s2index<s2.length())
		{
			if(s1.charAt(s1index)==s2.charAt(s2index))
				count++;
			s1index++;
			s2index++;
			
		}
		if(count==s2.length())
			return true;
		}

	}
	return false;
		
	
  }
}
