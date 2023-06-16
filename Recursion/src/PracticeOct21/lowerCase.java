package PracticeOct21;

public class lowerCase {

	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s1 = "";
		System.out.println(s.toLowerCase());
		char[] ca = s.toCharArray();
		int i = 0;
		lower(ca, i);

		s = new String(ca);
		System.out.println(s);

	}

	private static void lower(char[] ca, int i) 
	{
		if (i < ca.length)
		{
			char ch = ca[i];
			if (ch >= 'a' && ch <= 'z')
				ca[i] = (char) (ch - 32);

			lower(ca, i + 1);
		}

	}

}
