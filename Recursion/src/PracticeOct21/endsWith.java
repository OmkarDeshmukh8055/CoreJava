package PracticeOct21;

public class endsWith {

	public static void main(String[] args) {
		String s = "abcd";
		String s1 = "cd";
		if (s1.length() > s.length())

			System.out.println(false);
		else
		{
              int i=s.length()-1;
              int j=s1.length()-1;
              boolean  result=endswith(s,i,s1,j);
              System.out.println(result);
		}
		System.out.println(s.endsWith(s1)); 
	}

	private static boolean endswith(String s, int i, String s1, int j) {
           
		if(j>=0)
		{
			if(s.charAt(i)==s1.charAt(j))
				return endswith(s,i-1,s1,j-1);
			else
				return false;
		}
		return true;

	}

}
