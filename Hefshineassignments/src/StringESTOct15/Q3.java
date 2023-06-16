package StringESTOct15;

public class Q3 {

	public static void main(String[] args) {
String s="aabbbcc";
int max=Integer.MIN_VALUE;
int count=0;
for (int i = 0; i < s.length(); i++)
{  
	char ch=s.charAt(i);
	
	for (int j =0; j < s.length(); j++) 
	{
		char ch1=s.charAt(j);
		if(ch==ch1)
			count++;
	}
	
		
		
}
System.out.println(count);
	}

}
