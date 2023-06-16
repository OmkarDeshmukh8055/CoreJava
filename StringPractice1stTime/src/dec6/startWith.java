package dec6;

public class startWith {

	public static void main(String[] args) {

		String s="ab";
		String s1="a";
		System.out.println(s.startsWith(s1));
		if(s1.length()<=s.length())
		{
			int i = 0;
		for (; i < s.length() && i<s1.length(); i++) 
			if(s1.charAt(i)!=s.charAt(i))
				break;
		if(i<s1.length())
			System.out.println(false);
		else
			System.out.println(true);
		}
		else
			System.out.println(false);
		
	}

}
