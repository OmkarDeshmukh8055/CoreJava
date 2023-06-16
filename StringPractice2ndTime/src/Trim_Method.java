
public class Trim_Method {

	public static void main(String[] args) {
		String s="        om            ";
		s=trim(s);
		System.out.println(s);

	}

	private static String trim(String s) {
		String s1="";
		int i=0,j=s.length()-1;
		while(s.charAt(i)==' ')
		{
				i++;
		}
		while(s.charAt(j)==' ')
		{
				j--;
		}
		for (int j2 =i; j2 <=j; j2++)
		{
			s1=s1+s.charAt(j2);
		}
		return s1;
	}

}
