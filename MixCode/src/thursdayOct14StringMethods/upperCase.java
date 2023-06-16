package thursdayOct14StringMethods;

public class upperCase {
static String s="abcd";
	public static void main(String[] args)
	{
           String s1=s.toUpperCase();
           System.out.println(s1);
           
           String s2=myupperCase();
           System.out.println(s1);
           
	}
	private static String myupperCase() 
	{String s3="";
		for (int i = 0; i < s3.length(); i++)
		{
			
			char ch=s3.charAt(i);
			if(ch>='a' && ch<='z')
				s3=s3+(char)(ch-32);
			else
				s3=s3+ch;
			
		}
		return  s3;
	}

}
