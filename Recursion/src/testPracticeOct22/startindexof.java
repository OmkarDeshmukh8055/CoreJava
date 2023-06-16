package testPracticeOct22;

public class startindexof {

	public static void main(String[] args) {
            
		String s="abcdab";
		String s1="ab";
		System.out.println(s1.lastIndexOf(s));
		
		if(s1.length()>s.length())
		
			System.out.println(-1);
			else
			{
		int	i=0;
			int result =check(s,s1,i);
			System.out.println(result);
		    }
	}

	private static int check(String s, String s1, int i) {
      if(i<s.length())
      {  
    	  if(s.charAt(i)==s1.charAt(0))
    	  {
    		boolean j=  loopj(s,s1,i+1,0);
    		if(j==true)
    			return i;
    		else
    	  return check(s,s1,i+1);
      }
	}
  return -1;
}

	private static boolean loopj(String s, String s1, int i, int j) {

		if(i<s.length())
		{
			if(j<s1.length())
			{
				if(s.charAt(i)==s1.charAt(j))
					return loopj(s,s1,i+1,j+1);

					return false;
			
			
			}
			return false;
			
		}
		return true;
		}
	}
