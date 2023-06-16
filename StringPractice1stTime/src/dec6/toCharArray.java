package dec6;

import java.util.Arrays;

public class toCharArray {

	public static void main(String[] args) {

		String s="abcde";
		
		char caa[]=s.toCharArray();
		System.out.println(Arrays.toString(caa));
		System.out.println("Implimention of toCharArray method");
		char[] ca=new char [s.length()];
		for (int i = 0; i <s.length(); i++) 
		{
			ca[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(ca));
	}

}
