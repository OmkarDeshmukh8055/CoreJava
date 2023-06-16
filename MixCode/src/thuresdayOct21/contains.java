package thuresdayOct21;

public class contains {

	public static void main(String[] args) {
  String s1="abcd";
  String s2="ab";
  
  if(s2.length()>s1.length())
	  System.out.println(false);
  else
  {
	 int  i=0;
	  System.out.println(contain(s1,s2,i));
  }
  System.out.println(s1.contains(s2));
  
 	}

	private static boolean contain(String s1, String s2, int i) {
         if(i<s1.length())
         {
        	 if(s1.charAt(i)!=s2.charAt(0))
        	 {
        	  
        		 return contain(s1,s2,i+1);
        	 }
        	  else
        	  {
        		  int j=0;
        		  boolean check=chechker(s1,s2,i,j);
        		  if(check==true)
        			  return true;
        		  else
        			  return contain(s1,s2,i+1);
        	  }
        	 }
        	 return false;
         
	}

	private static boolean chechker(String s1, String s2, int i, int j) {
           if(j<s2.length())
           {
        	   if(i<s1.length())
        	   {
        		   if(s1.charAt(i)==s2.charAt(j))
        		   {
        			   return chechker(s1,s2,i+1,j+1);
        		   }
        		   else
        			   return false;
        			   
           }
		return false;
           }
           return true;
	}

	
}
