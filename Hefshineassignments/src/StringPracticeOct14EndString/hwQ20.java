package StringPracticeOct14EndString;

public class hwQ20 {

	public static void main(String[] args) {
String s="aabbccddeeffg";
String s1="";

for (int i = 0; i < s.length(); i++) 
{      
	int count=0;
         
	for (int j = 0; j < s1.length(); j++)
	{
		if(s.charAt(i)==s1.charAt(j))
		{
			count++;
		}
	}
		if(count==0)
		{
			s1=s1+s.charAt(i);
		}

	 
}
System.out.println(s1);

	}

}
