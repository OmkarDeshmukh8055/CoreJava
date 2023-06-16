package StringTestOct16;

public class Q3 {

	public static void main(String[] args) {
String s="abbbcccc";

int min=0;
int count=0;

for (int i = 0; i < s.length(); i++) 
{          
	for (int j = 0; j < s.length(); j++)
	{
		if(s.charAt(i)==s.charAt(j))
		{
			count++;
		}
	}
		if(count==0)
		{
			min=count;
		}
		
	}System.out.println(min);

	}

}
