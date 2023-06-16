package day23String13Oct;

public class compareto {

	static String s1="abcdkjhhkjkn";
	 static String s2="ab";

	public static void main(String[] args)  throws Exception
	{
               System.out.println(s1.compareTo(s2));  
               System.out.println(myComPareTo());
               
	}
	private static int myComPareTo()
	{
		int index=0;
		if(index<s1.length() && index<s2.length())
		{
			if(s1.charAt(index)!=s2.charAt(index))
					return s1.charAt(index)-s2.charAt(index);
				
	    }
		index++;
		return s1.length()-s2.length();
}

}
