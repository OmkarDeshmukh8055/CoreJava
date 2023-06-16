package thuresdayOct21;

public class indexOf {

	public static void main(String[] args) {
      String s="ksfsjbv";
      String s1="a";
      if(s.length() <s1.length())
System.out.println(-1);
      else
	  {
		 int i=0;

       int result=indexof(s,s1,i);
      System.out.println(result);
	  }
	}

	private static int indexof(String s, String s1, int i) {
          if(i< s.length())
          {
        		  if(s.charAt(i)==s1.charAt(0))
        		  {
        		  indexof(s,s1,i+1,0);
        		  return i;
        		  }
        		  else
        		  {
        	  indexof(s,s1,i+1);
        		  }
        		  return   indexof(s,s1,i+1);
          }
		return -1;
	}

	private static boolean indexof(String s, String s1, int i, int j) {

		if(j<s1.length())
		{
			if(i<s1.length()) 
			{
			if(s.charAt(i)==s1.charAt(i))
			
				return indexof(s,s1,i+1,j+1);
			return false;
			}
			return false;
		}
		return false;
	}

}
