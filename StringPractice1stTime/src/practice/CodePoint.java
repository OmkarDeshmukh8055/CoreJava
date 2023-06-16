package practice;

public class CodePoint {

	public static void main(String[] args) {

		String s="omkar";
		System.out.println(s.codePointAt(1));
		System.out.println();
		int ch=s.charAt(1);
		System.out.println(ch);
		
		
		// all code
		for (int i = 0; i < s.length(); i++)
		{	
			int ch1=s.charAt(i);
			System.out.println(ch1);
		}
		
	}

}
