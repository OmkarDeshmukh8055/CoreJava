package testPracticeOct22;

public class indexof {

	public static void main(String[] args) {
    String s1="dbcabcd";
    String s2="abc";
    int i=0;
    System.out.println(s1.indexOf(s2));
  
    
    if(s2.length()>s1.length())
    	System.out.println(-1);
    else
    {
    	  int index=indexof(s1,s2,i);
    	  System.out.println(index);
    }
    
	}

	private static int indexof(String s1, String s2, int i) {
		
		if(i<s1.length())
		{
		
			if(s1.charAt(i)==s2.charAt(0))
			{
				int j=0;
				boolean checker=loopj(s1,s2,i+1,j);
				if(checker==true)
					return i;
				
			else {
				return indexof(s1,s2,i+1);			}
			}
	
			}
		
		return -1;
			
			
		}

	private static boolean loopj(String s1, String s2, int i, int j) {
        if(j<s2.length())
        {
        	if(i<s1.length())
        	{
        		if(s1.charAt(i)==s2.charAt(j))
        		{
        			return true;
        		}
        		else
        		
        			return loopj(s1,s2,i+1,j+1);
        		}
        	return false;
        }
 
		return true;
      		
	}

	

}
