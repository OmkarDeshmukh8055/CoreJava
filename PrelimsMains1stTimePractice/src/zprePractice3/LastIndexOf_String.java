package zprePractice3;

public class LastIndexOf_String {

	public static void main(String[] args) {
		String s1="aOmkarOmk_Oamk";
		String s2="Omk";
		int index=0;
	
		if(s2.length()<=s1.length())
		{
			for (int i = s1.length()-1;i>=0; i--)
			{	
				String ss="";
					if(s1.charAt(i)==s2.charAt(0))
					{
						for (int j = i; j < i+s2.length(); j++) 
						{
							ss=ss+s1.charAt(j);
						}
					}
					if(ss.equals(s2))
					{
						System.out.println(i);
						break;
					}
			}
		}
		else
			System.out.println(-1);
	}

}
