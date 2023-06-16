package StringESTOct15;

public class Q6 {

	public static void main(String[] args) {
String s="abc";
String s1="";
for (int i = 0; i < s.length(); i++) 
{
    char ch=s.charAt(i);
     for (int j = 0; j < s.length(); j++)
     {
		
    	
     if(ch>='a' && s.charAt(j)<='z')
     {
       	 s1=s1+(char)(ch-32);
       	break; 
     }
     else
    	 s1=s1+(char)(ch-32);	 
     }
     
}

System.out.println(s1);

String a="PQR";
String a1="";
for (int i = 0; i < a.length(); i++) 
{
    char ch=a.charAt(i);
     for (int j = 0; j < a.length(); j++)
     {
		
    	
     if(ch>='A' && a.charAt(j)<='Z')
     {
       	 a1=a1+(char)(ch+32);
       	break; 
     }
     else
    	 a1=a1+(char)(ch+32);	 
     }
     
}

System.out.println(a1);


	}

}
