package erp;

public class Start_With {

	public static void main(String[] args) {
		String s1="omkar";
	String s2="omkar";
	System.out.println(s1.startsWith(s2));
	if(s2.length()==0)
		System.out.println("ture");
	else if(s2.length()>s1.length())
	System.out.println("false");
		else
		{
			int c=0;
			for (int i = 0; i <s2.length(); i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{c++;
					System.out.println("false");
					break;
				}
			}
			if(c==0)
				System.out.println("true");
		}
	}

}
