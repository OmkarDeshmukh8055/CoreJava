package testPracticeOct22;

import java.util.Arrays;



public class lowercase {

	public static void main(String[] args) {
          String s="OMKARDESHMUKH";
          System.out.println(s.toLowerCase());
      
          lowercase(s,0);
          
          
	}

	private static void lowercase(String s, int i) {
        if(i<s.length())
        {
        	char ch=s.charAt(i);
                	
        	if(ch>='A' && ch<='z')
        		ch=(char)(ch+32);
        		System.out.print(ch);
        	lowercase(s,i+1);
        }
	}

}
