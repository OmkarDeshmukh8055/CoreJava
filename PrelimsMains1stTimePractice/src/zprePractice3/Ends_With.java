package zprePractice3;

public class Ends_With {

	public static void main(String[] args) {

		String s1="omkar";
		String s2="kar";
			
		int i=s1.length()-1;
		int j=s2.length()-1;
		//.args. ii=s2.length();
		int cnt=0;
		while(j>=0)
		{
			if(s1.charAt(i)!=s2.charAt(j))
			{
				System.out.println("no");
				break;
			}
			else
			{
			cnt++;
			}
			j--;
			i--;
		}
		if(cnt==s2.length())
			System.out.println(true);
	}

}
