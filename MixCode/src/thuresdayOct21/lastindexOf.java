package thuresdayOct21;

public class lastindexOf {

	public static void main(String[] args) {
          String s="abcdabcabcd";
          String s1="cd";
          if(s.length()<s1.length())
          {
        	  System.out.println(-1);
          }
          else
          {
        	 int i=s.length()-1;
        	int  s2=lastindex(s,s1,i);
        	System.out.println(s2);
          }
	}

	private static int lastindex(String s, String s1, int i) {
           
		if(i>=0)
		{
			if(s.charAt(i)==s1.charAt(0))
			{
			boolean loopj=index(s,s1,i,0);
			if(loopj=true)
				return i;
			else
				return lastindex(s,s1,i-1);
		}
			return lastindex(s,s1,i-1);
	}
		
    return -1;
}

	private static boolean index(String s, String s1, int i, int j) {
        if(j<s1.length())
        {
        	if(i<s1.length())
        	{
        	if(s.charAt(i)==s1.charAt(i))
        	
        		return index(s,s1,i+1,j+1);
        		return false;
        }
        		
        	return false;
        }
        
        	
        
		return true;
	}
}