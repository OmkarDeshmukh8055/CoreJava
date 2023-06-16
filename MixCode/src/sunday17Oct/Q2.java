package sunday17Oct;

public class Q2 {
	static String s = "abcdeabcdebc";
	static String s1 = "de";

public	static void main(String[] args) {

		int result = s.lastIndexOf(s1);
		System.out.println(result);
		int result1 = mylast();
		System.out.println(result1);

	}

	private static int mylast() {
		if (s1.length() > s.length())
			return -1;

		for (int i = s.length() - 1; i >= 0; i--) 
		{
			if (s.charAt(i) == s1.charAt(0)) 
			{

				int sindex = i + 1;
				int s1index = 1;
				int count = 1;
				while (sindex<s.length()  && s1index<s1.length()  )
				{
					if (s.charAt(sindex) == s1.charAt(s1index))

						count++;
					sindex++;
					s1index++;

				}
				if (count == s1.length()) 
				{
					return i;
				}
			}
		}
		return -1;
	}
}
