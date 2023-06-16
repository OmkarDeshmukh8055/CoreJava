package StringPracticeOct14EndString;

import java.util.Arrays;
import java.util.Iterator;

public class tocharArray {
 static String s="DESHMUKH";


	public static void main(String[] args)
	{
		char[] s1=s.toCharArray();
System.out.println(Arrays.toString(s1));


char []s3=new char[s.length()];


		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			 s3[i]=ch;
			
		}
	System.out.println(Arrays.toString(s3));
	}

}
