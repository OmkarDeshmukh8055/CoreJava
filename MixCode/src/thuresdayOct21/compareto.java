package thuresdayOct21;

public class compareto {

	public static void main(String[] args) {
String s="abcda";
String s1="abcdvg";
System.out.println(s.compareTo(s1));
  int i=0;
int result =compareto(s,s1,i);
System.out.println(result);
	}

	private static int compareto(String s, String s1, int i) {
       
       if(i<s.length()&& i<s1.length())
       {
       if(s.charAt(i)!=s1.charAt(i))
       
    	  return s.charAt(i)-s1.charAt(i);
       
       
    	  else 
    	   	
    		return  compareto(s,s1,i+1);
    	  }
    	  return s.length()-s1.length();
    	
     
	
	}

}
