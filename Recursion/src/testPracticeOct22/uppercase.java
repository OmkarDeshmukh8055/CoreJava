package testPracticeOct22;

public class uppercase {

	public static void main(String[] args) {

		String s="abcd";
	
		System.out.println(s.toUpperCase());
		
		uppercase(s,0);
	}

	private static void uppercase(String s, int i) {
        if(i<s.length())
        {
        	if(s.charAt(i)>='a'&&s.charAt(i)<='z')
        	{
        		char ch=s.charAt(i);
        		ch=(char)(s.charAt(i)-32); 
        		
        		System.out.print(ch);
        		uppercase(s,i+1);
        	}
        }
	}

}
