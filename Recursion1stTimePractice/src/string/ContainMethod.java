package string;

public class ContainMethod {

	public static void main(String[] args) {
		String s1="ghjgabcfhjghjabc";
		String s2="ap";
		
		if(s2.length()<=s1.length())
		{	
			int count=0;
			
			
			count=loopI(0,s1,s2,count);
			if(count==0)
			{
				System.out.println(false);
			}
		}
		else
			System.out.println(false);
	}

	private static int loopI(int i ,String s1, String s2, int count)
	{
		if(i< s1.length()-s2.length()+1)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
					String subS1="";
					int j = i;
					
					subS1=loopJ( i,subS1,j,s1,s2);
					if(subS1.compareTo(s2)==0)
					{
						count++;
						System.out.println(true);
						return count;
					}		
			}
			return loopI(i+1,s1, s2,count);
		}
		return count;
	}

	private static String loopJ(int i,String subS1, int j, String s1, String s2) {
		if(j <i+s2.length())
		{
			subS1=subS1+s1.charAt(j);
			return loopJ(i, subS1, j+1, s1, s2);

		}
		return subS1;
	}
}
