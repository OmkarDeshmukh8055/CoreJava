package thursdayOct14StringMethods;

public class ReplaceSachin {
	 static String s1="abcde" ;

	public static void main(String[] args) 
	{
		String result =s1.replace('d', 'z');
		System.out.println(result);
		String result1=myreplace('d','z');
		System.out.println(result1);
		

	}

	private static String myreplace(char oldchar, char newchar)
	{
		String s="";
		for (int i = 0; i < s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch==oldchar)
				
			ch=newchar;
			s=s+ch;
			
		}
		return s;
	}

}
