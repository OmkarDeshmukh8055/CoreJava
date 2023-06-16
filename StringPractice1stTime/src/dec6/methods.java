package dec6;

public class methods {

	public static void main(String[] args) {

		String s="omkar";
		System.out.println("endsWith "+s.endsWith("om"));
		System.out.println();
		System.out.println("startsWith "+s.startsWith("om"));
		System.out.println();

		System.out.println("contains "+s.contains("om"));
		System.out.println();

		System.out.println("subString "+s.substring(2,4));
		System.out.println();


		System.out.println("charAt and codePointAt");

		for (int i = 0; i <s.length(); i++)
		{
			System.out.print(s.charAt(i)+" ");
			System.out.println(s.codePointAt(i));
		}
		System.out.println();
		System.out.println("toCharArray");
	char[] ca=s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.println(ca[i]);
		}
		System.out.println();
		// compare
		String s1="om";
		System.out.println("s2 String upperCase "+s1.toUpperCase());

		System.out.println("compare "+s.compareTo(s1));
		System.out.println();
		System.out.println("compareToIg "+s.compareToIgnoreCase(s1));
		System.out.println();

		System.out.println("indexOf "+s.indexOf("k"));
		System.out.println();

		System.out.println("lastIndexOf "+s.lastIndexOf("n"));
		System.out.println();

		System.out.println("replace "+s.replace('o', 'O'));
		
		String s2="   OM  ";
		System.out.println("s2 String trim "+s2.trim());
		System.out.println();

		System.out.println("s2 String length "+s2.length());
		System.out.println();

		System.out.println("s2 String length "+s2.length());
		System.out.println();

		System.out.println("s2 String lowerCase "+s2.toLowerCase());
		System.out.println();

		
		System.out.println("s2 and s1 equal ? "+s2.equals(s1));
		System.out.println();

		System.out.println("concat");
		System.out.println(s1.concat(s2));


		

		
	}

}
