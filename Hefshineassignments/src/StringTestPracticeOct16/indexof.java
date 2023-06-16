package StringTestPracticeOct16;

public class indexof {
static String s="abcdeabcdef";
static String s1="abcdef";

	public static void main(String[] args) {
boolean s2=s.contains(s1);
System.out.println(s2);
boolean s3=myindex();

	}

	private static boolean myindex()
	{
		
      if(s.length()<s1.length())
    	  return false;
      for (int i = 0; i < s.length(); i++) 
      {       
		 for (int j = 0; j < s1.length(); j++)
		 {
			if(s.charAt(i)==s1.charAt(0))
			{
				int sindex=i;
				int s1index=0;
				int count=0;
			
			while(sindex<s.length() &&s1.length()>s1index)
			{
	
				count++;
			sindex++;
			s1index++;
			
			}
			if(count==0)
				return true;
			}	
		 }
	}
		return false;
	}

	}
