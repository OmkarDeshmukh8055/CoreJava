package zprePractice1;

public class Longest_SubString {

	public static void main(String[] args) {
		String s="abcabcdabcdeabcdabcaba";
		
		int start=0;
		int max=0;																								
		
		for (int i = 0; i <s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++)
			{	int SubStringlen=0;
					for (int k = i; k <j-1; k++) 
					{
						if(s.charAt(k)==s.charAt(j))
						SubStringlen++;
					}
			if(SubStringlen>0)
			{
				int len=j-i;
				if(len>max)
				{
				max=len;
				start=i;
				}
				break;
			}
			if(j==s.length()-1)
			{
				int len=j-i+1;
				if(len>max)
				{
				max=len;
				start=i;
				}
			}
			}
		}
		for (int i = start; i <start+max; i++) 
		{
			System.out.println(s.charAt(i));
		}
		System.out.println();
	}

}
