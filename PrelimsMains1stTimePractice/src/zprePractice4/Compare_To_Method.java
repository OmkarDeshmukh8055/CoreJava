package zprePractice4;

public class Compare_To_Method {

	public static void main(String[] args) {

		String s1="omkar";
		String s2="omklr";
		System.out.println(s1.compareTo(s2));
		if(s2.length()<=s1.length())
		{
			int i = 0;
			for ( ;i <s1.length()&& i<s2.length(); i++) 
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					System.out.println(s1.charAt(i)-s2.charAt(i));
					break;
				}
			}
			if(i==s1.length()|| i==s2.length())
				System.out.println(s1.length()-s2.length());
		}
		else
			System.out.println(s1.length()-s2.length());
		
	}

}
