package thursdayOct14StringMethods;

public class replaceS {
	static String s2="adf";
	public static void main(String[] args)
	{
         
         String s1=s2.replace('a','b');
         System.out.println(s1);
         String s=myreplace('a','b');
         System.out.println(s);
	}

	private static String myreplace(char old , char news) 
	{     String s="";
		for (int i = 0; i < s2.length(); i++) 
		{
			char ch=s2.charAt(i);
			if(ch==old)
			{
				ch=news;
			s=s+ch;
			}
			else
			
			s=s+ch;
		}
		return s;
	
	}
}
