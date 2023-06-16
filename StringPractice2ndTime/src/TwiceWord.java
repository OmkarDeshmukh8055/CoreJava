
public class TwiceWord {

	public static void main(String[] args) {
		String s="abcd";
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
			s1=s1+s.charAt(i)+s.charAt(i);
		}
		System.out.println(s1);
	}

}
