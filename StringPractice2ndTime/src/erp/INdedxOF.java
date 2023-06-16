package erp;

public class INdedxOF 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		String s2="";		
		System.out.println("java method : "+s1.indexOf(s2));
		myCode(s1,s2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,String s2) 
	{
		//write code here
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
			System.out.println("index :"+ii);
		}
	}
}
