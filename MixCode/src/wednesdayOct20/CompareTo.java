package wednesdayOct20;

public class CompareTo {

	public static void main(String[] args) {
           String s="abcd";
           String s1="abcdef";
           System.out.println(s.compareTo(s1));
           int i=0;
           int s3=compare(s,s1,i);
           System.out.println(s3);
        
	}

	private static int compare(String s, String s1, int i) {
        if(i<s.length()&& i<s1.length())
		
        {
        	if(s.charAt(i)!=s1.charAt(i) )
        		return s.length()-s1.length();
        	else 
        		compare(s,s1,i+1);
        }
        		return s.length()-s1.length();        				
        }

}
