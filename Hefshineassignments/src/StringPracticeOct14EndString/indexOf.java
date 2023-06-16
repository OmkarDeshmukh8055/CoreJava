package StringPracticeOct14EndString;

public class indexOf {
       static String s="abcdefgh";
       static String s1="abd";
	public static void main(String[] args) 
	{
           int result1=s.indexOf(s1);
           System.out.println(result1);
           
           int result2=myIndexOf();
           System.out.println(result2);
           
           
	}
	private static int myIndexOf()
	{
		if(s1.length()>s.length())
			
		{
			return -1;
		}
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				int sindex=i+1;
				int s1index=1;
				int counter=1;
			
				
		while(sindex<s.length() && s1index<s1.length())
		{
			if(s.charAt(sindex)==s1.charAt(s1index))
				counter++;
			sindex++;
			s1index++;
			
		}
		if(counter==s1.length())
			return i;
			
		}
			}
		return -1;
	}

}
