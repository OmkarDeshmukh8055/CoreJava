
public class String_Methood {

	public static void main(String[] args) {
		String s1 = "abC";
		String s2 = "aBc";
		String s3="abc";
		System.out.println(s1.endsWith(s3));
		
		System.out.println(s1.indexOf("C"));
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s1.codePointAt(0));
		
		System.out.println(s1.contains(s2));
		
		System.out.println(s1.length());
		
		System.out.println(s1.endsWith(s2));
		
		System.out.println(s1.startsWith(s2));
		
		System.out.println(s1.endsWith(s2));
		
		System.out.println(s1.substring(0, 2));
	}

}
