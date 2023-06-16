package erp;

import java.util.Arrays;
import java.util.Iterator;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "abbcfedafbcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		String s="a";
		for(int i=0;i<s1.length();i++)
		{
			int c=0;
			for(int j=i-1;j>=0;j--)
			{
				if(s1.charAt(i)!=s.charAt(j))
				{
					c++;
				}
			}
				if(c==0)
				s=s+s1.charAt(i);
			
		}
		System.out.print(s);	
	}
}
