package dec6;

import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {

		String s1="omkar";
		char []ca1=s1.toCharArray();
		
		for (int i = 0; i < ca1.length; i++)
		{
			System.out.print(ca1[i]+" ");
		}
		
		System.out.println();
		char ca2[]= {'D','e','s','h','m','u','k','h'};
				System.out.println(Arrays.toString(ca2));
		
	}

}
