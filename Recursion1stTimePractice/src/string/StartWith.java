package string;

public class StartWith {

	public static void main(String[] args) {

		String s="omkar";
		String s1="om";
		boolean startWith=true;
		if(s.length()>=s1.length())
		{
			startWith=myStartWith(s,s1,0,startWith);
		}
		else
			startWith=false;
			System.out.println(startWith);
	}

	private static boolean myStartWith(String s, String s1, int i, boolean startWith) {
		if(i<s1.length())
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				startWith=false;
				return startWith;
			}
			return myStartWith(s, s1, i+1, startWith);
		}
		return startWith;
	}

}
