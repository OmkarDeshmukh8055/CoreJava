package zprePractice3;

public class Sub_String_Find {

	public static void main(String[] args) {
			String s="abcabcdabcdeabcdefg";
			int max=0;
			int start=0;
			for (int i = 0; i <s.length(); i++)
			{
				for (int j = i+1; j <s.length(); j++) 
				{
					int lenOfSubString=0;
					for (int k = i; k <j-1; k++)
					{
						if(s.charAt(k)==s.charAt(j))
						{
							lenOfSubString++;
						}
					}
					if(lenOfSubString>0)
					{
						int lenOfLongestSubString=j-i;
						if(lenOfLongestSubString>max)
						{
						max=lenOfLongestSubString;
						start=i;
						}
						break;
					}
					if(j==s.length()-1)
					{
						int lenOfLongestSubString=j-i+1;
						if(lenOfLongestSubString>max)
						{
						max=lenOfLongestSubString;
						start=i;
						}
					}
				}
			}
			for (int i = start; i <start+max; i++) 
			{
				System.out.println(s.charAt(i));
			}
	}

}
