package day22String12Oct;

public class orignalPrintONlyInString {

	public static void main(String[] args) {
String s="abcdabca";

String s1="";

for (int i = 0; i < s.length(); i++) 
{

char ch=s.charAt(i);
     int count=0;
  	    for (int j = 0; j < s.length(); j++) 
  	    {
		    if(s1.charAt(j)==ch)	
		    
		    	count++;
  	    }  
		
  	      if(count==0) 
  	      {
  	    	s1=s1+ch;
  	      }
  	  System.out.println(s1);
}     


	}

}
