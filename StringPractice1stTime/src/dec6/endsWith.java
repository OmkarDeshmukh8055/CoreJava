package dec6;

public class endsWith {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="bcd";
		System.out.println(s1.endsWith(s2));
	int	i=s1.length()-1;
	int	j=s2.length()-1;
	
		if(s2.length()<=s1.length())
		{
			while(j>=0)
			{
				if(s1.charAt(i)!=s2.charAt(j))
					break;
				i--;j--;
			}
			if(j>=0)
				System.out.println(false);
			else
				System.out.println(true);

		}
		else
			System.out.println(false);
	}

}
