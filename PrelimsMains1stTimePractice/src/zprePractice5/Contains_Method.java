package zprePractice5;

public class Contains_Method {

	public static void main(String[] args) {

		String s1="omkar";
		String s2="l";
		
		if(s2.length()<=s1.length())
		{	
			int i = 0;
			for (; i <s1.length()-s2.length()+1; i++) 
			{	
				String ss="";
				if(s1.charAt(i)==s2.charAt(0))
				{
						for (int k = i; k <i+s2.length(); k++)
						{
							ss=ss+s1.charAt(k);
						}

				}
				if(ss.equals(s2))
				{
					System.out.println(true);
					break;
				}
			}
			if(i==s1.length()-s2.length()+1)
				System.out.println(false);
		}
		else
			System.out.println(false);
	}

}
