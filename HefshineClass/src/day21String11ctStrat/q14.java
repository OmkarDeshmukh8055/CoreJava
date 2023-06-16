package day21String11ctStrat;

public class q14 {

	public static void main(String[] args)
	{
		String s="12345";
		int i=0;
		for (; i < s.length(); i++) 
		{
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
				break;
				
		}
		if(i==s.length())
			System.out.println("only digit");
		else
			System.out.println("few charactor");
	}

}
