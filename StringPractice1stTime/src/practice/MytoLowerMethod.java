package practice;

public class MytoLowerMethod {
	
	public static void main (String []args)
	{
		String s="OMKAR deshmukh";
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{	char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				s1=s1+((char)(ch+32));
			}
			else
				s1=s1+ch;
		}
		System.out.println(s1);
	}
}
