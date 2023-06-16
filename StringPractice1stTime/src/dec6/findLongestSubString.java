package dec6;

public class findLongestSubString {

	public static void main(String[] args) {

		String s="abcabcdabcde";
		int max=0;
		int start=0;
		for (int i = 0; i <s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++)
			{
				int cnt=0;			
				for (int k = i; k <= j-1; k++) 
				{
					if(s.charAt(k)==s.charAt(j))
					{
						cnt++;
				    }
				}
			     
				if (cnt>0)
				{
					int subStringLength=j-i;
					if(subStringLength>max)
					{
						max=subStringLength;
						start=i;
					}
					break;
				}
				if(j==s.length()-1)
				{
					int subStringLength=j-i+1;

					if(subStringLength>max)
				
				{
					max=subStringLength;
					start=i;
				}
					
				}
			}
		
		}
		System.out.println(max);
		for (int i =start; i < start+max; i++) 
		{
			System.out.println(s.charAt(i));
		}
	}

}
