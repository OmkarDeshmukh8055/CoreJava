package erp;

public class Frequency_Of_Each_Char {

	public static void main(String[] args) {
		String s1="aaabbbbbbbcccccccddddd";
		String s="";
		for (int i = 0; i <s1.length(); i++) 
		{
			int c=0;
			for (int j =i-1; j >=0;j--)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					c++;
				}
			}
			if(c==0)
				s=s+s1.charAt(i);
		}
		int a[]=new int[s.length()];
		int ai=0;
		for (int i = 0; i <s.length(); i++) 
		{
			int c=0;
			for (int j = 0; j< s1.length(); j++) {
				if(s.charAt(i)==s1.charAt(j))
				{
					c++;
				}
			}
			a[ai++]=c;
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(s.charAt(i)+" "+a[i]);
		}
	}

}
