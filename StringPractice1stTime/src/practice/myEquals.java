package practice;

public class myEquals {

	public static void main(String[] args) {

		String s1="Omkar ";
		String s2="Omkar";
		System.out.println(s1.equals(s2));
		
		if(s1.length()==s2.length())
		{	int cnt=0;
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				cnt++;
				break;
			}
		}
		if(cnt==0)
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

}
