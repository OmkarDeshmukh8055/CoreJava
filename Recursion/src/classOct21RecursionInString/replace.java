package classOct21RecursionInString;

public class replace {

	public static void main(String[] args) {
		String s = "sfabcdkjkjjfjabcdkjefwjfjabcd";
		String replaceto = "abcd";
		String replaceby = "@";
		int i = 0;
		String s1 = "";
		s1 = replace(s, i, replaceto, replaceby, s1);
		System.out.println(s1);
		System.out.println(s.replaceAll(replaceto, replaceby));
	}

	private static String replace(String s, int i, String replaceto, String replaceby, String s1) {
		if (i < s.length()) 
		{
          char ch=s.charAt(i);
          if(s.charAt(i)!=replaceto.charAt(0))
          {
        	  s1=s1+ch;
        	  return replace(s,i+1,replaceto,replaceby,s1);
          }
		
          else
          {
        	  int j=0;
        	  boolean isThereReplaceTo=findReplaceToHere(s,i,replaceto,j);
        	  if(isThereReplaceTo==true)
        	  {
        		  s1=s1+replaceby;
        		  return replace (s,i+replaceto.length(),replaceto,replaceby,s1);
          }
          else
          {
        	 s1=s1+s.charAt(i);
        	 return replace(s,i+1,replaceto,replaceby,s1);          
          }
		
		}
	}
		return s1;
	}

	private static boolean findReplaceToHere(String s, int i, String replaceto, int j) {
               if(j<replaceto.length())
               {
            	   if(i<s.length())
            	   {
            		   if(s.charAt(i)==replaceto.charAt(j))
            			   return findReplaceToHere(s,i+1,replaceto,j+1);
            		   else
            			   return false;
               }
		return false;
	}
	   return true;

	}
}
