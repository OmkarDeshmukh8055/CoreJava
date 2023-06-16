package practice;

public class subString {

	public static void main(String[] args) {
		
		String s="abcdabcdef";	
		int max=Integer.MIN_VALUE;
		int start=0;
		
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i+1; j <s.length() ; j++)
			{
				int cnt=0;
				for (int k = i; k < j-1; k++)
				{
					if(s.charAt(k)==s.charAt(j))
						cnt++;
				}
				if(cnt>0)
				{
					int subSlen=j-i;
					if(subSlen>max)
					{
						max=subSlen;
						start=i;
					}
					break;
				}
				if(j==s.length()-1)
				{
					int subSlen=j-i+1;
					if(subSlen>max)
					{
						max=subSlen;
						start=i;
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
