package StringTestPracticeOct16;

import java.util.Arrays;

public class tocharArray {
  static String s="omakr";
	public static void main(String[] args) {
      char []ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		char ch1[]=new char [s.length()];
		
		for (int i = 0; i < s.length(); i++)
		{
			char ca=s.charAt(i);
			ch1[i]=ca;
		}
		System.out.println(Arrays.toString(ch1));
		
	}

}
