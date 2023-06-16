package testPracticeOct22;

public class compareTo {

	public static void main(String[] args) {
        String s="abkjnjd";
        String s1="abd";
        System.out.println(s.compareTo(s1));
        
        compareto(s,s1,0);
        System.out.println(compareto(s,s1,0));
	}

	private static int compareto(String s, String s1, int i) {
         if(i<s.length()&&i<s1.length())
         {
        	 if(s.charAt(i)!=s1.charAt(i))
        	 {
        		 return s.charAt(i)-s1.charAt(i);
        	 }
        		 else
        		 
        			  compareto(s,s1,i+1);
        		 
         }
		return s.length()-s1.length();
	}
	
}
