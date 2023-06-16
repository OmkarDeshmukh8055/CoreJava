package StringTestOct16;

public class Q8 {
static String s="abcd";
static String s1="abCD";
	public static void main(String[] args) {
		int s2=s.compareToIgnoreCase(s1);
		System.out.println(s2);
		
		int s3=mycompareTOIgnorecase();
  System.out.println(s3);
	}
	private static int mycompareTOIgnorecase() 
	{
    
		
		for (int i = 0; i < s.length(); i++)
		{
		char ch=s.charAt(i);
		int count=0;
		int sindex=0;
		int s1index=0;
			for (int j = 0; j < s1.length(); j++) 
			{
				char ch1=s1.charAt(j);
				
				if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' ||ch1>='a' && ch1<='z' || ch1>='A' && ch1<='Z' )
				{
				if(s.charAt(i)==s1.charAt(j))
				{
					count++;
				sindex++;
				s1index++;
				}
				if(s.length()==s1.length())
					return i;
									
			}
		}
	}
		return 0;
	}
	
}

