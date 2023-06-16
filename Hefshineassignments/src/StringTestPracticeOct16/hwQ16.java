package StringTestPracticeOct16;

public class hwQ16 {
	static String s = "asa";

	public static void main(String[] args) 
	{
		System.out.println(myaddition());
	}

	private static int myaddition() {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) 
		{

			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				sum=sum + Character.getNumericValue(s.charAt(i));
			}
			if (s.charAt(i) <= '0' && s.charAt(i) >= '9')
			{
				return 0;
			}
		}
		return sum;
	}

}
