package practice;

public class maxssubstring {

	public static void main(String[] args) {

		String s="abcabcdabcdeabcdefghiabcdabcde";
		
		int start=0;
		int max=0;//Integer.MIN_VALUE;
	
		for (int i = 0; i < s.length(); i++) 
		{	
			for (int j = i+1; j < s.length(); j++)
			{	int cnt=0;
				for (int k = i; k < j-1; k++)
				{
					if(s.charAt(k)==s.charAt(j))
					{
						cnt++;
					}
				}
				if(cnt>0)
				{
					int subLen=j-i;
					if(subLen>max)
					{
						max=subLen;
						start=i;
					}
						break;
				}
				
				if(j==s.length()-1)
				{
					int subLen=j-i+1;

					if(subLen>max)
					{
						max=subLen;
						start=i;
						break;	
					}
				}
			}
		} 
		System.out.println(max);
		for (int i = start; i < start+max; i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
