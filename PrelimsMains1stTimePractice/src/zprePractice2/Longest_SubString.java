package zprePractice2;

public class Longest_SubString {

	public static void main(String[] args)
	{
		String s="abcabcdabcdeabcd";
		int start=0;
		int max=0;
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = 0; j < s.length(); j++)
			{
				int SubStringLen=0;
				for (int k = i; k <j-1; k++)
				{
					if(s.charAt(k)==s.charAt(j))
						SubStringLen++;
				}
				if(SubStringLen>0)
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
	for (int i = start; i < start+max; i++) 
	{
		System.out.println(s.charAt(i));
	}
	}

}
