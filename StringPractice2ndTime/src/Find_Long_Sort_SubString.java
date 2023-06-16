
public class Find_Long_Sort_SubString {

	public static void main(String[] args) {
		String m="i am good boy";
		String[] s =m.split(" ");
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i + 1; j < s.length; j++) 
			{
				if (s[i].length()>s[j].length())
				{
					String t = s[i];
					s[i] = s[j];
					s[j] = t;
				}
			}
		}
	System.out.println(s[0]);
		System.out.println(s[s.length-1]);

	}

}
