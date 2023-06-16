package testPracticeOct22;

import java.util.Arrays;

public class tocharArray {

	public static void main(String[] args) {
		String s="omkardeshmukh";
		char ca[]=new char[s.length()];
	String s1="";
	tocharArray(s,ca,s1,0);
	System.out.println(Arrays.toString(ca));

	}

	private static void tocharArray(String s, char[] ca,String s1, int i) {
      
		if(i<ca.length)
		{
			ca[i]=s.charAt(i);
           s1=s1+s.charAt(i);
		
			tocharArray(s,ca,s1,i+1);
		}
	}

}
