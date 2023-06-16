package sunday17Oct;

public class indexOf
{
static String s="pabcdabcd";
static String s1="abcd";
	public static void main(String[] args) 
	{
int s3=s.indexOf(s1);
System.out.println(s3);
int s2=myindexOf();
System.out.println(s2);
	}
	
	private static int myindexOf() 
	{
		if(s.length()<s1.length())
		{
			return -1;
		}
		for (int i = 0; i < s.length(); i++)
		{     
		

			if(s.charAt(i)==s1.charAt(0))
			{
				int count=1;
				int sindex=i+1;
				int s1index=1;
				
				while (sindex<s.length() && s1index<s.length())
				{
					if(s1.charAt(sindex)==s.charAt(s1index))
					count++;
					sindex++;
					s1index++;
				
				}
				if(count==s1.length())	
					return i;	
				
			}
		}
		return -1;
	}

}
