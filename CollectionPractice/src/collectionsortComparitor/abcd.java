package collectionsortComparitor;

import java.util.Comparator;

public class abcd implements Comparator<student1>{

	
	public int compare(student1 s1, student1 s2) 
	{
		  if(s1.marks>s2.marks)
				return 1;
		         else if(s1.marks<s2.marks)
		         return -1;
	
		         else
		         {
           if(s1.name.length()>s2.name.length())
        		 return 1;
        	 else if(s1.name.length()<s2.name.length())
        		 return - 1;
        	 else
        	 {
        		 if(s1.name.charAt(0)>s2.name.charAt(0))
        			 return 1;
        		 else if(s1.name.charAt(0)<s2.name.charAt(0))
        			 return -1;
        		 else
        			 return 0;
        	 }
             
         }
	}


}


