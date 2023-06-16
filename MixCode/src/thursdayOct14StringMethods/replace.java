package thursdayOct14StringMethods;

public class replace {
static String s="abcd";
	public static void main(String[] args) {
      String s1=s.replace('a', 'z');
      System.out.println(s1);
      
      String s2=myreplace('a', 'z');
      System.out.println(s2);
      
     
	}
	private static String myreplace(char old, char newchar) 
	{
		String ss="";
		for (int i = 0; i < s.length(); i++) 
		{ 
			char ch=s.charAt(i);
			if(ch==old)
		 ch=newchar;
			ss=ss+ch;
			
			
		}
		return ss;
	}

}
