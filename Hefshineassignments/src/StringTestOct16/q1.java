package StringTestOct16;

public class q1 {
	static String s="aabcdeab";
static	String s1="ab";
	public static void main(String[] args) {
 
   int s2=s.lastIndexOf(s1);
   System.out.println(s2);
	
int s3=mylastindex();
System.out.println(s3);
	}
	private static int mylastindex()
	{
		if(s.length()<s1.length())
		{
		return -1;
		}
		
		for (int i = s.length()-1;i>=0; i--) 
		{
			for (int j=s1.length()-1;j>=0; j--)
			{
				if(s.charAt(i)==s1.charAt(0))
				{
					int count=0;
					int sindex=i;
					int s1index=0;
				
					while(s.length()<sindex && s1.length()<s1index)
					{
					
						count++;
						
						sindex++;
						s1index++;
					}
				
					if(count==0)
						return i;
						
				}
				
			}
		}return-1;
	}
	
}
