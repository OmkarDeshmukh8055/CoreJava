package StringPracticeOct14EndString;

import java.util.Iterator;

public class lowerCase {
  static String s="ASDFG";
	public static void main(String[] args) 
	{
		String s1=s.toLowerCase();
		System.out.println(s1);
		
		
       for (int i = 0; i < s.length(); i++) 
       {
    	   String s2="";
    	   char ch=s.charAt(i);
    	  if(ch>='a' && ch <='z')
    	  {
    		 s1=s1+(char)(ch+32);
    	  }
       }
       System.out.println(s1);
    	
	}

}
