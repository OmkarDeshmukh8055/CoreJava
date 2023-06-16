package PracticeOct21;

public class uppercase {

	public static void main(String[] args) {
 String s="omkar";
 String s1="";
 System.out.println(s.toUpperCase());
 char[] ca=s.toCharArray();
 int i=0;
 upper(ca,i);

 s=new String(ca);
 System.out.println(s);
 
	}

	private static void upper(char[]ca, int i) {
         if(i<ca.length)
         {
        	 char ch=ca[i];
        	 if(ch>='a' && ch<='z')
        	 ca[i]=(char)(ch-32);
        	 

        	 upper(ca,i+1);         }
	}

}
