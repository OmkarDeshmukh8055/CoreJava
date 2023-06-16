package dec6;

public class lastIIndexOf {

	public static void main(String[] args) {

		String s1="ormkar";
		String s2="r";
		System.out.println(s1.lastIndexOf(s2));
		if(s2.length()<=s1.length())
		{
			int index=-1;
			for (int i=0; i < s1.length()-s2.length()+1; i++)
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
							index=i;
						}
			
					}
				}
				System.out.println(index);
			}
		else
			System.out.println(-1);
		
	


	}

}
