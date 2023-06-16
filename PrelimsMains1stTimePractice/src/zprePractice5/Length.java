package zprePractice5;

public class Length {

	
		static int length(String s1)
		{
			int i = 0;
		
		try {
			
			for (;; i++) 
			{
				s1.charAt(i);
			}
		} catch (Exception e)
		{

		}
		return i;

		}
public static void main(String[] args)
{
	int m=Length.length("omkar");
	System.out.println(m);
	
}
}
