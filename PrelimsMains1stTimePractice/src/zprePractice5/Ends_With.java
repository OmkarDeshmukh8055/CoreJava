package zprePractice5;

public class Ends_With {

	public static void main(String[] args) {

		String s1="omkar";
		String s2="kar";
		int j=s2.length()-1;
		int i=s1.length()-1;
		if(s1.charAt(i)==s2.charAt(j))
		{
		while(j>=0)
		{
			if(s1.charAt(i)!=s2.charAt(j))
			{
				System.out.println(false);
				break;
			}
			i--;
			j--;
		}
		if(j<0)
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

}
