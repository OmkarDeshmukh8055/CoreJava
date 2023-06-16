package testPracticeOct22;

public class equal {

	public static void main(String[] args) {
       String s1="abcd";
       String s2="abcdjb";
       System.out.println(s1.equals(s2));
       
       if(s1.length()!=s2.length())
    	   System.out.println(false);
       
    	   else
    	   {
    		   boolean equal=check(s1,s2,0);
           System.out.println(equal);
         
    	   }
       
       
    		   
	}

	private static boolean check(String s1, String s2, int i) {
        if(i<s1.length())
        {
        	if(s1.charAt(i)==s2.charAt(i))
        	
        		return check(s1,s2,i+1);
        			 return false;
             }
		return true;
	
	}
}
