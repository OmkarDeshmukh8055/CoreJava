package PracticeOct21;

import java.util.Arrays;

public class toCharArray {

	public static void main(String[] args) {
     
		String s="OmakrDeshmukh";
		String s1="";
		char[] ch=new char[s.length()];
		tocharArray(ch,s,s1,0);
		System.out.println(Arrays.toString(ch));
	}
	private static void tocharArray(char[]ch,String s, String s1, int i) {
        
		if(i<s.length())
		{
			ch[i]=s.charAt(i);
			
			s1=s1+s.charAt(i);
			tocharArray(ch,s,s1,i+1);
			
		}
		
	}


}
