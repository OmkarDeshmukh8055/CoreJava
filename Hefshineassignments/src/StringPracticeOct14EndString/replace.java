package StringPracticeOct14EndString;

public class replace {

	static String s="abcd";
	public static void main(String[] args)
	{
          String s1=s.replace('a','z');
          System.out.println(s1);
          
          String s2=myReplace('a','z');
          System.out.println(s2);
          
          
	}
	private static String myReplace(char old,char news) 
	{
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==old)
			ch[i]=news;
			
			
		}
		return new String (ch);
	}

}
