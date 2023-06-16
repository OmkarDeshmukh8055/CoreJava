package practice;

public class SSSSSSSubStringggggg {

	public static void main(String[] args) {
		String s = "abcabcdabcde";
		int max = 0;
		int start = 0;
		for (int i = 0; i < s.length(); i++)
		{

			for (int j = i + 1; j < s.length(); j++)
			{
				int cnt = 0;

				for (int k = i; k < j - 1; k++)
				{
					if (s.charAt(k) == s.charAt(j))
					{
						cnt++;
					}
				}

				if (cnt > 0)
				{
					int subString = j - i;
						if (subString > max) 
						{
							max = subString;
							start = i;
						}
						break;
				}
					
				if (j == s.length() - 1)
				{
					int subString = j - i + 1;
					if (subString > max)
					{
						max = subString;
						start = i;
					}
				}
			}
		}
		System.out.println(max);
		for (int i = start; i < start+max; i++) {
			System.out.println(s.charAt(i));
		}
	}

}
