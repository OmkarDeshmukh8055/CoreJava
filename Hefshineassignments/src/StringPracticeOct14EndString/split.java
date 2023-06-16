package StringPracticeOct14EndString;

import java.util.Arrays;


public class split {

	public static void main(String[] args) {

		 String s="abc def ghi jkl mno"  ;
		String[] ss=s.split(" ");
		System.out.println(Arrays.toString(ss));
		 
		int spaceCount=0;
		for (int i = 0; i < s.length(); i++)
	
			if(s.charAt(i)==' ')
				spaceCount++;
			String sa[]=new String[spaceCount+1];
			
					String s1="";
					int saindex=0;
					
	       for (int i = 0; i < s.length(); i++) 
          {
	                char ch=s.charAt(i);
	                if(ch==' ')
	                {
	                	sa[saindex++]=s1;
	                s1="";
	                }
	                else if(i==s.length()-1)
	                {
	                	s1=s1+ch;
	                	sa[saindex++]=s1;
	                }
	                else
	                {
	                	s1=s1+ch;
	                } 
          }
	      for (int i = 0; i < sa.length; i++) 
	      {
			System.out.println(sa[i]);
		} 
	       
	}

}
