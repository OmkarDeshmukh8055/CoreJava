package testPracticeOct22;

public class lastindexof 
{

	public static void main(String[] args) 
	{
        String s="abab";
        String s1="ab";
        System.out.println(s.lastIndexOf(s1));
        int i=s.length()-1;
       if(s1.length()>s.length())
    	   System.out.println(-1);
       else
       {
    	   int lastindex= loopi(s,s1,i);
           System.out.println(lastindex);
             
       }
        
	}

	private static int loopi(String s, String s1, int i) 
	{
		if(i>=0)
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				int j=0;
				boolean loopj=checker(s,s1,i,j);
				
				if(loopj==true)
					return i;
				else
			
					return loopi(s,s1,i-1);
			}
			return loopi(s,s1,i-1);		
			}
		return -1;
}

	private static boolean checker(String s, String s1, int i, int j) {
           if(j<s1.length())
           {
        	   if(s.length()>i)
        	   {
        	if(s.charAt(i)==s1.charAt(j)) 
        	return	checker(s,s1,i+1,j+1);
        		return false;
           }
        	   return false;
           }
           
		return true;
	}
	}
