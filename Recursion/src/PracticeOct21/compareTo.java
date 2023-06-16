package PracticeOct21;

public class compareTo {

	public static void main(String[] args) {

		String s="abcd";
		String s1="agcd";
		System.out.println(s.compareTo(s1));
		int result=compareto(s,s1,0);
		System.out.println(result);
	
	}

	private static int compareto(String s, String s1, int i) {
        if(i<s.length()&&i<s1.length())
        {
       if( s.charAt(i)!=s1.charAt(i))
    	   return s.charAt(i)-s1.charAt(i);
        
        else
            return	compareto(s,s1,i+1);
	}
        return s.length()-s1.length();
        }

}
