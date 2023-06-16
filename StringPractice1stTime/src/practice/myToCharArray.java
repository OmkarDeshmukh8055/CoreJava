package practice;

import java.util.Arrays;

public class myToCharArray {

	public static void main(String[] args) {
		String s="omkar";
		char []sa=s.toCharArray();
		System.out.println(Arrays.toString(sa));
			int cnt=0;
		for (int i = 0; i < s.length(); i++)
		{
			cnt++;
		}
		System.out.println(cnt);
		char caa[]=new char[cnt];
		for (int i = 0; i < s.length(); i++)
		{
			caa[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(caa));
		
	}

}
