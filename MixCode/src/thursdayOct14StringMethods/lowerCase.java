package thursdayOct14StringMethods;

public class lowerCase {
 static String s="ASDFG";
	public static void main(String[] args) {
   String s1=s.toLowerCase();
   System.out.println(s1);
	
  // String s2=myLowerCase();
  // System.out.println(s2);
	

		String s2="";
		
		for (int i = 0; i <s2.length(); i++)
		{
			char ch=s2.charAt(i);
			if(ch>='a' && ch<='z')
			
			s2=s2+(char)(ch+32);
			else
				s2=s2+ch;
			
		}
	System.out.println(s2);
		
	}

}
