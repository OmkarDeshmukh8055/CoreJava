package dec6;

public class contains {

	public static void main(String[] args) {

		System.out.println((char)('c'+20));
		
		String s1="omkar";
		String s2="om";
		System.out.println(s1.contains(s2));
		if(s2.length()==0)
		{
			System.out.println(true);				
		}
		else
		{
		if(s2.length()<=s1.length())
		{
			int i = 0;
		for (; i < s1.length()-s2.length()+1; i++)
		{
			if (s1.charAt(i) == s2.charAt(0)) 
			{
				String subS = "";
				for (int j = i; j < i + s2.length(); j++) 
				{
					subS = subS + s1.charAt(j);
				}
				if (subS.equals(s2))
				{
					System.out.println(true);
					break;
				}
		}
	}
		if(i==s1.length()-s2.length()+1)
			System.out.println(false);
		}
		else
		System.out.println(false);
	}
	}

}
