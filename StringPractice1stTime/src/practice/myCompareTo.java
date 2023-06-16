package practice;

public class myCompareTo {

	public static void main(String[] args) {

		String s1="om";
		String s2="vv vv";
		System.out.println(s1.compareTo(s2));
		int i = 0;
		if(s2.length()<=s1.length())
		{
		for (; i < s1.length()&&i<s2.length(); i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.println(s1.charAt(i)-s2.charAt(i));
				break;
			}
			else
			{
				System.out.println(0);
				break;
			}
		}
		}
		else
			//if(s2.length()<s1.length())
				System.out.println(s1.length()-s2.length());
			//else if(s2.length()>s1.length())
			//System.out.println(s2.length()-s1.length());
	
		}
}
