
public class SortingString_Array {

	public static void main(String[] args) {
		String[] s = { "krushna", "suraj", "nilesh", " rushi", "sachin", "om", "muku" };

		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i + 1; j < s.length; j++) 
			{
				if (s[i].length() > s[j].length())
				{
					String t = s[i];
					s[i] = s[j];
					s[j] = t;
				}
			}
		}
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}

}
