package practice;

public class vaishanvi {

	public static void main(String[] args) {
		String s1="vaishnavi";
		String s2="  vaisHnavi";
		System.out.println(s1.compareTo(s2));
		if(s1.length()!=s2.length())
		{
			System.out.println(s1.length()-s2.length());
		}
		else
		{
			int count=0;
			for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.println(s1.charAt(i)-s2.charAt(i));
			}
			else
			{
				count++;
			}
			}
			if(count==s1.length())
				System.out.println(0);
		}	
	}
}
