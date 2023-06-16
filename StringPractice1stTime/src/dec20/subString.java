package dec20;

public class subString {

	public static void main(String[] args) {
		String s="abcabcdabcfdeabcfdeffbf";
		
		int start=0;
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < s.length(); i++)
		{	
			for (int j = i+1; j < s.length(); j++)
			{		
					int cnt=0;
				for (int k = i; k < j-1; k++)
				{
					if(s.charAt(k)==s.charAt(j))
						cnt++;
				}
					if(cnt>0)
					{
						int subStringlen=j-i;
						
						{
							if(subStringlen>max)
							{
								max=subStringlen;
							start=i;
							}
						}
						break;
					}
					else if(j==s.length()-1)
					{
						int subStringlen=j-i+1;
						
						{
							if(subStringlen>max)
							{
								max=subStringlen;
							start=i;
							}
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
