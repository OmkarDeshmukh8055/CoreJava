package day24String14Oct;

import java.util.Arrays;

public class tocharArray {
      static String s1="abcdefghi";
	public static void main(String[] args) {
           char[]ca1=s1.toCharArray();
           System.out.println(Arrays.toString(ca1));
           
           char []ca2=new char[s1.length()];
          
           
           for (int i = 0; i < s1.length(); i++) 
           {
			  char ch=s1.charAt(i);
			  ca2[i]=ch;
		}
           System.out.println(Arrays.toString(ca2));
	}
	

}
