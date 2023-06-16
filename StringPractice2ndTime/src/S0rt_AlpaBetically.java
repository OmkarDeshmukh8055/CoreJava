
public class S0rt_AlpaBetically {

	public static void main(String[] args) {
		String[] s1 = { "krushna", "suraj", "nilesh",
				"kalpesh","rushi", "sachin", "om", "mukund" };
		for (int i = 0; i < s1.length; i++) 
		{
			for (int j = i + 1; j < s1.length; j++) 
			{
				if (s1[i].compareToIgnoreCase(s1[j])>0)
				{
					String t = s1[i];
					s1[i] = s1[j];
					s1[j] = t;
				}
			}
		}
		for (int i = 0; i < s1.length; i++)
		{
			System.out.println(s1[i]);
		}
	}

}
