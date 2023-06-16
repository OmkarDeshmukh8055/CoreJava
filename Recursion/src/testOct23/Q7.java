package testOct23;

public class Q7 {

	public static void main(String[] args) {
     String s1="abcdsd";
     String s2="abcdgd";
     System.out.println(s1.compareToIgnoreCase(s2));
     
     
    int s3=comparetoignore(s1,s2,0);
   System.out.println(s3);
	}

	private static int comparetoignore(String s1, String s2, int i) {
		 if(s1.length()>s2.length())
	     {
	    	 return s1.length()-s2.length();
	     }
	    	 else if(s1.length()<s2.length())
	    	 {
	    		 
	    		 return s1.length()-s2.length();	 
	         }
	    
     if(i<s1.length())
     {
    	 if(s1.charAt(i)==s2.charAt(i))
    	 {
    		 return comparetoignore(s1,s2,i+1);
    	 }
    		 else
    		 {
    			return s1.charAt(i)-s2.charAt(i); 
    		 }
     }
	return 1;
	}

}
