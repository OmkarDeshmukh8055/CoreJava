package StringTestPracticeOct15;

public class indexOf {
 static String s="asabdef";
 static String s1="def";
	public static void main(String[] args) 
	{
       int s3=s.indexOf(s1);
       System.out.println(s3);
       int s4=myindexof();
       System.out.println(s4);
         
	}
	private static int myindexof() 
	{  
		if(s1.length()>s.length())
		{
			return -1;
		}
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==s1.charAt(0))
			{
			int s1index=i+1;
			int s2index=1;
			int count=1;
			
			while(s1index<s.length() && s2index<s1.length())
			{
			 if(s.charAt(s1index)==s1.charAt(s2index))
		
				 count++;

			 s1index++;
			 s2index++;  
			}
		if(count==s1.length())
			return i;
			}
		}
		return -1;
		
	}

}
