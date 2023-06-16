package StringTestPracticeOct15;

public class hwQ8 {

	public static void main(String[] args) {
String s= "dddddddhh";
String s1=s.replace('d','f');
System.out.println(s1);

String s2=myreplace('d','f');
System.out.println(s2);

	}

	private static String myreplace(char old, char news) 
	{    String s3="";
	 
		for (int i = 0; i < s3.length(); i++) 
		{
			char ch=s3.charAt(i);
			if(s3.charAt(i)==old)
			{
				ch=news;
			}
				s3=s3+(ch+32);
								{
					
				}
				
		}
		return s3;
	}

}
