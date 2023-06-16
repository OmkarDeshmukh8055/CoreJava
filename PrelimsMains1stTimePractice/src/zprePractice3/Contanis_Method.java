package zprePractice3;

public class Contanis_Method {

	public static void main(String[] args) {

		String s1="omkar";
		String s2="r";
		
		if(s2.length()<=s1.length())
		{
			int i=0;
			for (; i <s1.length()-s2.length()+1; i++) 
			{
				String s="";
				if(s1.charAt(i)==s2.charAt(0))
				{
					for (int j = i; j <i+s2.length(); j++) 
					{
						s=s+s1.charAt(j);
					}
				}
				if(s.equals(s2))
				{
					System.out.println(true);
					break;
				}
			}
			if(i==s1.length()-s2.length()+1)
				System.out.println(false);
		}
			else
			System.out.println(false);
	}

}
