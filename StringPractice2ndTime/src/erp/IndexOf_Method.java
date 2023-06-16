package erp;

public class IndexOf_Method {

	public static void main(String[] args) {
	String s1="hjgomkar";
	String s2="ka";
	System.out.println(s1.indexOf(s2));
	int ii=-1;
	if(s2.length()==0)
		System.out.println(0);
	else
	{
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				String c="";
				for (int j = i; j <i+s2.length(); j++) 
				{
					c=c+s1.charAt(j);
				}
				if(c.equals(s2))
				{
					ii=i;
				}
			}
		}
		System.out.println(ii);
	}
	}
	
}
