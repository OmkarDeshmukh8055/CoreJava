package zprePractice4;

public class Last_Index_OF {

	public static void main(String[] args) {

		String s1="OmkarOm",s2="Oam";
		
		int i=s1.length()-1;
		int j=s2.length()-1;
		
		
		while(j>=0)
		{
			if(s1.charAt(i)!=s2.charAt(j))
			{
				System.out.println(false);
				break;
			}
			j--;
			i--;
		}
		if(j==-1)
		{
			System.out.println(true);
		}
	}

}
