package StringPracticeOct12;

public class Q19 {

	public static void main(String[] args) {
String s="abcabcdacbdeaba";

int max=Integer.MIN_VALUE;
char maxChar=0;

for (int i = 0; i <s.length(); i++) 
{
	char ch=s.charAt(i);
	int count=0;
	
	for (int j = 0; j < s.length(); j++) 
	{
		if(s.charAt(j)==ch)
			count++;
		
	}
	if (max<count)
	{
		max=count;
		maxChar=ch;
	}
	
}
System.out.println(maxChar+" "+max);
	}

}
