
public class toUpper_Lower_Case {

	public static void main(String[] args) {
		String s="omkar ABASAHEB DESHmukh";
		s=Upper(s);
		System.out.println(s);
		s=lower(s);
		System.out.println(s);

	}

	private static String lower(String s) {
		char [] ca=s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
			if(ca[i]>='A' && ca[i]<='Z')
				ca[i]=(char)(ca[i]+32);
		
		s=new String(ca);
		return s;
	}


	private static String Upper(String s) 
	{
		char [] ca=s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
			if(ca[i]>='a' && ca[i]<='z')
				ca[i]=(char)(ca[i]-32);
		
		s=new String(ca);
		return s;
	}

}
