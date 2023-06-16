package day23String13Oct;

public class Q31Nway {

	public static void main(String[] args) {
String s= "dcba";
s=s.toUpperCase();
String s1="";

            for (int i = 0; i < s.length(); i++) 
                 
            	     s1=s1+(char)(155-s.charAt(i));
            	     System.out.println(s1);
	              
	}

}
