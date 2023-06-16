package StringTestPracticeOct15;

public class upperCaseagain {
 static String s="abcdAf";
	public static void main(String[] args) {

		String s1=myupper();
		System.out.println(s1);
	}
	private static String myupper() {
         String s1="";
         for (int i = 0; i < s.length(); i++) 
         { char ch=s.charAt(i);
         
			if(ch>='a'&&ch<='z')
			{
				s1=s1+(char)(ch-32);
			}
			else
				s1=s1+ch;
		}
		return s1;
	}

}
