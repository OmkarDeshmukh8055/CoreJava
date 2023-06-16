package day23String13Oct;

public class codepoint {
static String s="a";
	public static void main(String[] args) {
		
		
		System.out.println(s.codePointAt(0));
		int num=mycodePointAt(0);
		System.out.println(num);
		
	}
	private static int mycodePointAt(int i)
	{
	 return s.charAt(i);
		
		}

}
