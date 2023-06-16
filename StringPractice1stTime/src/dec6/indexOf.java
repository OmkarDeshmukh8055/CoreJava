package dec6;

public class indexOf {

	public static void main(String[] args) {

		String s1="omkar";
		String s2="kar";
		if(s2.length()<=s1.length())
		{
			int i = 0;
			for (; i < s1.length()-s2.length()+1; i++)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					String subS="";
					for (int j = i; j < i+s2.length(); j++)
					{
						subS=subS+s1.charAt(j);
					}
						if(subS.equals(s2))
						{
							System.out.println(i);
							break;
						}
			
					}
				}
			if(i==s1.length()-s2.length()+1)
				System.out.println(-1);
			}
		else
			System.out.println(-1);
		
	}

}
