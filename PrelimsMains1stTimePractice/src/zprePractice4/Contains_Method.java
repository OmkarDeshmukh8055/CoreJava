package zprePractice4;

public class Contains_Method {

	public static void main(String[] args) {

		String s1="Omkarom";
		String s2="Om";
		int cnt=0;
		if(s2.length()<=s1.length())
		{
		for (int i = 0; i <s2.length(); i++) 
		{	
			boolean conditionIsSatisFied=true;
			for (int j = 0; j <s1.length(); j++)
			{				
				String s="";
				if(s2.charAt(0)==s1.charAt(j))
				{
					for (int k = j; k <j+s2.length(); k++)
					{
						s=s+s1.charAt(k);
					}
				}
			if(s.equals(s2))
			{
				conditionIsSatisFied=false;	
				System.out.println(true);
				cnt++;
				break;
			}
			
		}
			if(conditionIsSatisFied==false)
				break;
		}
		if(cnt==0)
			System.out.println(false);
		}
		else
			System.out.println(false);
	}

}
