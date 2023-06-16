package StringPracticeOct14EndString;

public class toUpperCase 
{
     static  String s="abcd";
	public static void main(String[] args) 
	{
         String s1=s.toUpperCase();
         System.out.println(s1);
         
         String s2=mytoUpperCase();
         System.out.println(s1);
         
         
	}
	private static String mytoUpperCase() 
	{
		String s="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch>='a'  && ch<='z')
				s=s+(char)(ch-32);
			else
				s=s+ch;
				
				
		}
		return s ;
	}

}
