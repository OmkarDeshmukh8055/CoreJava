package day24String14Oct;

public class replace {
static String s1="abc";

	public static void main(String[] args) {
 String s2=s1.replace('a', 'z');
 System.out.println(s2);
 
 String s3=myReplace('a','z');
 System.out.println(s3);
 
	}

	private static String myReplace(char oldchar,char newchar) 
	{
		char[]ca=s1.toCharArray();
		
		for (int i = 0; i < ca.length; i++) 
		{
			if(ca[i]==oldchar)
				ca[i]=newchar;
		}
		return new String(ca);
	}

}
