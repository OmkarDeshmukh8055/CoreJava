package zprePractice5;

public class Starts_With {

	public static void main(String[] args) {

		String s1="omkar";
		String s2="omkara";
		int j=0;
		int i=0;
		if(s2.length()>s1.length())
		{
			System.out.println(false);
			return;
		}
		if(s1.charAt(i)==s2.charAt(j))
		{
		while(j<=s2.length()-1)
		{
			if(s1.charAt(i)!=s2.charAt(j))
			{
				System.out.println(false);
				break;
			}
			i++;
			j++;
		}
		if(j==s2.length())
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

}
