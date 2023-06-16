package sunday17Oct;

public class trim {

	public static void main(String[] args) {
String s="       abcdefgh          ";

int i =0;
int j=s.length()-1;
	while(true)
	{
           if(s.charAt(i)==' ')
        	   i++;
           else
        	   break;
	}
	while(true)
	{
		if(s.charAt(j)==' ')
			j--;
		else
			break;
	}
	
 String s1="";
	for (int j2 = i; j2 <=j; j2++)
	{
		s1=s1+s.charAt(j2);
	
	
	}System.out.println(s1);
	
}}
