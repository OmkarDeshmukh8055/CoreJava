package PracticeOct21;

public class contains {

	public static void main(String[] args) {
	     String s1="Omkar";
         String s2="om";
         
         if(s2.length()>s1.length())
       	  System.out.println(false);
         else
         {
       	  int i=0;
            System.out.println(contains(s1,s2,i));
         }
         System.out.println(s1.contains(s2));
	}

	private static boolean contains(String s1, String s2, int i) {
           if(i<s1.length())
           {
           	if(s1.charAt(i)!=s2.charAt(0))
           		return contains(s1,s2,i+1);
           	else
           	{
           		int j=0;
           		boolean resultofs2Ins1=compareEntires2Ins1(s1,i,s2,j);
           		if(resultofs2Ins1==true)
           			return true;
           		else
           			return contains(s1,s2,i+1);
           	}
           		
           }
		return false;
	}

	private static boolean compareEntires2Ins1(String s1, int i, String s2, int j) {
            if(j<s2.length())
            {
           	if(i<s1.length())
           	{
           		if(s1.charAt(i)==s2.charAt(j))
           		{
           			return compareEntires2Ins1( s1,i+1,s2,j+1); 
           		}
           	
           	else
	         	return false;
	}
    		return false;
	}
	return true;

	}

}
