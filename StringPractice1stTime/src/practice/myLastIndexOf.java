package practice;

public class myLastIndexOf
{
	public static void main (String []args)
	{
		String s1="Deshmukh omkar(omy)";
		String s2="om ";
		System.out.println(s1.lastIndexOf(s2));
		if(s2.length()==0 )
		{
			System.out.println(0);
			System.exit(0);
		}
		if(s2.length()<=s1.length())
		{	int index=-1;
			for (int i = s1.length()-1;i>0; i--) 
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
						 index=i;
						System.out.println(index);
						break;
					}
					else
					{
						System.out.println(-1);
						break;
					}
				}
			}			
		}
		else
			System.out.println(-1);

	}
}
