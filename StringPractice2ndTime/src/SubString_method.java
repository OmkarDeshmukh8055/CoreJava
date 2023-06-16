
public class SubString_method {

	public static void main(String[] args) throws Exception {
		String s="omkarrushinanakrushna suraj;";
		System.out.println(s.substring(1,10));
		int start=0,end=10;
		String s1=mySubString(s,start,end);
		System.out.println(s1);
	}
	private static String mySubString(String s,int start, int end) throws Exception {
		if(start>end || start<0||end>s.length())		
			throw new Exception("check it length");
		String s1="";
		for (int i = start; i <end; i++) 
		{
		s1=s1+s.charAt(i);
		}
		return s1;
	}

}
