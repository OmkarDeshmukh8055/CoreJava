package dec6;

public class removeSpecificele {

	public static void main(String[] args) {

		String s="Omy";
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!='y')
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s);
		System.out.println(s1);
	}

}
