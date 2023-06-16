package practice;

public class indexOf {

	public static void main(String[] args) {

		String s1="omkarORom";
		String s2="om";
		
		if(s2.length()<=s1.length())
		{
			int index=-1;
		 for (int i = 0; i < s1.length()-s2.length()+1; i++) 
		 {
			if(s1.charAt(i)==s2.charAt(0))
			{	String sub="";
				for (int j = i; j < i+s2.length(); j++)
				{
						sub=sub+s1.charAt(j);
				}
				if(sub.equals(s2))
				{
					index=i;
					System.out.println(index);
					break;
				}
				
			}
		 }
		
		}
		else
			System.out.println(-1);
	}

}
