package day21String11ctStrat;

public  class removeElement
{
	public static void main(String []args)
	{
		String s="abcdefgh";
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!='h')
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}

}
