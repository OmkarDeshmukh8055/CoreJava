package testPracticeOct22;

public class contanis {

	public static void main(String[] args) {
          
		String s1="abcd";
		String s2="a09b";
		
		if(s2.length()>s1.length())
			System.out.println(false);
		else
		{
		int	i=0;
			contains(s1,s2,i);
			System.out.println(contains(s1,s2,i));
		}
		System.out.println(s1.contains(s2));
	}

	private static boolean contains(String s1, String s2, int i) {
         
		if(i<s1.length())
		{
			if(s1.charAt(i)!=s2.charAt(0))
			{
				return contains(s1,s2,i+1);
			}
			else
			{
			int j=0;
			boolean result= checker(s1,s2,i,j);
			if(result==true)
			return	true;
			else
			return contains(s1,s2,i+1);
			}
		}
		return false;
	}

	private static boolean checker(String s1, String s2, int i, int j) 
	{
          if(j<s2.length())
          {
        	  if(s1.length()>i)
        	  {
        		  if(s1.charAt(i)==s2.charAt(j))
        		  {
        			  return checker(s1,s2,i+1,j+1);
        		  }
        		  else
        			  return false;
        	  }
        	return false;	  
          }
		return true;
	}

}
