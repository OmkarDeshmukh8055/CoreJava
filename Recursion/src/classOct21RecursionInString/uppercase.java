package classOct21RecursionInString;

public class uppercase {

	public static void main(String[] args) {

		String s="abcd@EFGHI";
		char ca[]=s.toCharArray();
		int i=0;
		uppercase(ca,i);
		s=new String(ca);
		System.out.println(s);
	}

	private static void uppercase(char[] ca, int i) {
      if(i<ca.length)
      {
    	  //task
    	  char ch=ca[i];
    	  if(ch>='a' && ch<='z')
    		  ca[i]= ( char) (ch-32);
    	
    	  uppercase(ca,i+1);
      }
	}

}
