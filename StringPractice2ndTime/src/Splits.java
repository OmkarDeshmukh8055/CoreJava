
public class Splits {

	public static void main(String[] args) {
		String s1 = "krushna bhadva hai";
		String sa[] = s1.split(" ");

		for (int i = 0; i < sa.length; i++)
		{
			String s = sa[i];
			char m1=s.charAt(0);
			if(s.charAt(0) >='a'&& s.charAt(0)<='z')
			{
				m1=(char) (s.charAt(0)-32);
			}
		
			String ss = "";
			for (int j = s.length() - 1; j >= 0; j--)
			{
				ss=ss+s.charAt(j);
			}
				sa[i] = ss;
			
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i] + " ");
		}
	}

}
