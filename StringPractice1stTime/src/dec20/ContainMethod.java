package dec20;

public class ContainMethod {

public static void main(String[] args) {

		String s="abcd";
		String s1="abd";
		System.out.println(s.contains(s1));
		if(s.length()>=s1.length())
		{
			int i = 0;
			for ( ;i < s.length()-s1.length()+1; i++) 
			{

				if(s.charAt(i)==s1.charAt(0))
				{	
					String sub="";
					for (int j = i; j < i+s1.length(); j++) 
					{
						sub=sub+s.charAt(j);	
					}
										
					if(sub.equals(s1))
					{
						System.out.println(true);
						break;
					}
				}
			}
		if(i==s.length()-s1.length()+1)
				System.out.println(false);
		}

		else
			System.out.println(false);
	}

}
