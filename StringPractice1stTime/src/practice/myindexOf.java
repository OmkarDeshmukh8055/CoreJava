package practice;

public class myindexOf 
{
	public static void main (String []args)
	{
		String s1="Deshmukh omkar(omy)";
		String s2="om";
		System.out.println(s1.indexOf(s2));
		if(s2.length()==0 )
		{
			System.out.println(0);
			System.exit(0);
		}
		if(s2.length()<=s1.length())
		{
			for (int i = 0; i < s1.length(); i++) 
			{
				if(s1.charAt(i)==s2.charAt(0))
				{	
					String sub="";
					for (int j = i; j <i+s2.length(); j++)
					{
						sub=sub+s1.charAt(j);
					}
					if(s2.equals(sub))
					{
						System.out.println(i);
						break;
					}
					else
					{
						System.out.println(-1);
					}
				}
			}			
		}
		else
			System.out.println(-1);
	}
}
