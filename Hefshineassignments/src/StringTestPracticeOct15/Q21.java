package StringTestPracticeOct15;

public class Q21 {

	public static void main(String[] args) {
String s="abcdabcdeabc";

int max=Integer.MIN_VALUE;
int startIndex=0;

for (int i = 0; i < s.length(); i++)
{
	String s1="";
	for (int j = i; j < s.length(); j++) 
	{
		char ch=s.charAt(j);
		int count=0;
		
		for (int k = 0; k < s1.length(); k++) 
		{
		   if(s1.charAt(k)==ch)
		   {
			   count++;
		   }
		}
		if(count==0)
		s1=s1+ch;
		else
		{
			if(s1.length()>max)
            {
            	max=s1.length();
            	startIndex=i;
            	
            }
			break;
		}
	}
	
}
System.out.println(max);
System.out.println(startIndex);
for (int i =startIndex ; i < startIndex+max; i++)
{
  System.out.print(s.charAt(i));	
}

	}

}
